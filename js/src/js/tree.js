var treeData = [
    {
        "value": 10,
        "children": [
            {
                "value": 12,
                "children": [
                    {
                        "value": 81,
                        "children": [
                            {"value": 8},
                            {"value": 40}
                        ]
                    },
                    {
                        "value": 36,
                        "children": [
                            {"value": 97},
                            {"value": 44},
                            {"value": 60}
                        ]
                    }
                ]
            },
            {
                "value": 17,
                "children": [
                    {
                        "value": 65,
                        "children": [
                            {"value": 17}
                        ]
                    },
                    {
                        "value": 43,
                        "children": [
                            {"value": 21},
                            {"value": 09}
                        ]
                    }
                ]
            },
            {
                "value": 33,
                "children": [
                    {
                        "value": 91,
                        "children": [
                            {"value": 51}
                        ]
                    },
                    {
                        "value": 66,
                        "children": [
                            {"value": 9},
                            {"value": 22},
                            {"value": 84},
                            {"value": 47},
                            {"value": 51}
                        ]
                    },
                    {
                        "value": 30,
                        "children": [
                            {"value": 41},
                            {"value": 76}
                        ]
                    }
                ]
            }
        ]
    }
];

function tree() {

    var nodes;
    var radius = 15;

    var margin = {top: 20, right: 120, bottom: 20, left: 120},
        width = 960 - margin.right - margin.left,
        height = 800 - margin.top - margin.bottom;

    var i = 0,
        duration = 750,
        root;

    var tree = d3.layout.tree()
        .size([height, width]);

    var diagonal = d3.svg.diagonal()
        .projection(function (d) {
            return [d.x, d.y];
        });

    var line = d3.svg.line()
        .x(function (point) {
            return point.lx;
        })
        .y(function (point) {
            return point.ly;
        });

    function lineData(d) {
        // i'm assuming here that supplied datum
        // is a link between 'source' and 'target'
        var points = [
            {lx: d.source.x, ly: d.source.y},
            {lx: d.target.x, ly: d.target.y}
        ];
        return line(points);
    }

    function collapse(d) {
        if (d.children) {
            d._children = d.children;
            d._children.forEach(collapse);
            d.children = null;
        }
    }

    var svg = d3.select("body").append("svg")
        .attr("width", width + margin.right + margin.left)
        .attr("height", height + margin.top + margin.bottom)
        .append("g")
        .attr("transform", "translate(" + margin.left + "," + margin.top + ")");


    root = treeData[0]
    root.x0 = height / 2;
    root.y0 = 0;

    root.children.forEach(collapse);
    update(root);

    d3.select(self.frameElement).style("height", "800px");

    function update(source) {

        // Compute the new tree layout.
        nodes = tree.nodes(root).reverse(),
            links = tree.links(nodes);

        // Normalize for fixed-depth.
        nodes.forEach(function (d) {
            d.y = d.depth * 180;
        });

        // Update the nodes…
        var node = svg.selectAll("g.node")
            .data(nodes, function (d) {
                return d.id || (d.id = ++i);
            });

        // Enter any new nodes at the parent's previous position.
        var nodeEnter = node.enter().append("g")
            .attr("class", "node")
            .attr("transform", function (d) {
                return "translate(" + source.x0 + "," + source.y0 + ")";
            })
            .on("click", click);

        nodeEnter.append("circle")
            .attr("r", 1e-6)
            .style("fill", function (d) {
                return d._children ? "lightsteelblue" : "#fff";
            });

        nodeEnter.append("text")
            .attr("text-anchor", "middle")
            .attr("dy", "4px")
            .attr("font-size", 0)
            .text(function (d) {
                return d.value;
            })
            .style("fill-opacity", 0.1);

        // plus sign
        nodeEnter.append("line")
            .attr("stroke", "#AAA")
            .attr("stroke-width", "2")
            .attr("x1", radius * 1.2)
            .attr("y1", "0px")
            .attr("x2", radius * 1.8)
            .attr("y2", "0px")

        nodeEnter.append("line")
            .attr("stroke", "#AAA")
            .attr("stroke-width", "2")
            .attr("x1", radius * 1.5)
            .attr("y1", "-4px")
            .attr("x2", radius * 1.5)
            .attr("y2", "4px")

        // trasparent circle to bind the click
        nodeEnter.append("circle")
            .attr("r", radius)
            .attr("cx", radius *1.5)
            .attr("cy", "0px")
            .style("fill-opacity", 0)
            .style("opacity", 0)
            .call(add_node);

        // minus sign
        nodeEnter.append("line")
            .attr("stroke", "#AAA")
            .attr("stroke-width", "2")
            .attr("x1", radius - radius*2.2)
            .attr("y1", "0px")
            .attr("x2", radius - radius*2.8)
            .attr("y2", "0px")

        // trasparent circle to bind the click
        nodeEnter.append("circle")
            .attr("r", radius)
            .attr("cx", radius - 9)
            .attr("cy", "0px")
            .style("fill-opacity", 0)
            .style("opacity", 0)
            .call(remove_node);

        // Transition nodes to their new position.
        var nodeUpdate = node.transition()
            .duration(duration)
            .attr("transform", function (d) {
                return "translate(" + d.x + "," + d.y + ")";
            });

        nodeUpdate.select("circle")
            .attr("r", radius)
            .style("fill", function (d) {
                return d._children ? "lightsteelblue" : "#fff";
            });

        nodeUpdate.select("text")
            .style("font-size", radius)
            .style("fill-opacity", 1);

        // Transition exiting nodes to the parent's new position.
        var nodeExit = node.exit().transition()
            .duration(duration)
            .attr("transform", function (d) {
                return "translate(" + source.x + "," + source.y + ")";
            })
            .remove();

        nodeExit.select("circle")
            .attr("r", 1e-6);

        nodeExit.select("text")
            .style("font-size", "0")
            .style("fill-opacity", 1e-6);

        // Update the links…
        var link = svg.selectAll("path.link")
            .data(links, function (d) {
                return d.target.id;
            });

        // Enter any new links at the parent's previous position.
        link.enter().insert("path", "g")
            .attr("class", "link")
            .attr("d", function (d) {
                var o = {x: source.x0, y: source.y0};
                return diagonal({source: o, target: o});
            });

        // Transition links to their new position.
        link.transition()
            .duration(duration)
            .attr("d", diagonal);

        // Transition exiting nodes to the parent's new position.
        link.exit().transition()
            .duration(duration)
            .attr("d", function (d) {
                var o = {x: source.x, y: source.y};
                return diagonal({source: o, target: o});
            })
            .remove();

        // Stash the old positions for transition.
        nodes.forEach(function (d) {
            d.x0 = d.x;
            d.y0 = d.y;
        });


    }

    // Toggle children on click.
    function click(node) {
        if (node.children) {
            node._children = node.children;
            node.children = null;
        }
        else {
            node.children = node._children;
            node._children = null;
        }
        update(node);
    }

    function add_node(parent) {
        this.on("click", function (parent) {
            var child = {"value": 13};
            console.log("parent=" + parent)

            if (parent._children) {
                console.log("push");
                parent._children.push(child);
            }
            else {
                console.log("array");
                parent._children = [child];
            }
            update(parent);
        });
    }


    function remove_node(node) {

        d3.selectAll('.parent').each(function(parentDatum) {
            d3.select(this).selectAll('.child').each(function(childDatum) {
                console.log("child:" + childDatum.value)
            });
        });

        console.log("remove node " + node.parent);
        //if (node.parentNode && node.parentNode._children) {
        //    console.log('removing ' + node.name);
        //    if (node) {
        //        node.parentNode.children = null
        //    }
        //}
        //    this.on("click", function(d){
        //        update();
        //    });
    }

}