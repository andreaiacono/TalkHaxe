 var treeData = [
        {
            "name": "A",
            "value": 10,
            "children": [
                {
                    "name": "H",
                    "children": [
                        {
                            "name": "G",
                            "children": [
                                {"name": "O"},
                                {"name": "P"}
                            ]
                        },
                        {
                            "name": "T",
                            "children": [
                                {"name": "D"},
                                {"name": "M"},
                                {"name": "W"}
                            ]
                        }
                    ]
                },
                {
                    "name": "Q",
                    "children": [
                        {
                            "name": "C",
                            "children": [
                                {"name": "B"}
                            ]
                        },
                        {
                            "name": "N",
                            "children": [
                                {"name": "F"},
                                {"name": "E"}
                            ]
                        }
                    ]
                },
                {
                    "name": "S",
                    "children": [
                        {
                            "name": "Y",
                            "children": [
                                {"name": "Z"}
                            ]
                        },
                         {
                            "name": "L",
                            "children": [
                                {"name": "Q"},
                                {"name": "K"},
                                {"name": "N"},
                                {"name": "N"},
                                {"name": "X"}
                            ]
                        },
                        {
                            "name": "U",
                            "children": [
                                {"name": "T"},
                                {"name": "I"}
                            ]
                        }
                    ]
                }
            ]
        }
    ];

function tree() {

    var nodes ;
    var radius = 10;

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
            .x( function(point) { return point.lx; })
            .y( function(point) { return point.ly; });

    function lineData(d) {
        // i'm assuming here that supplied datum
        // is a link between 'source' and 'target'
        var points = [
            {lx: d.source.x, ly: d.source.y},
            {lx: d.target.x, ly: d.target.y}
        ];
        return line(points);
    }

    function collapse(d){
        if (d.children){
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
                .text(function (d) {
                    return d.name;
                })
                .style("fill-opacity", 0.1);

        // plus sign
        nodeEnter.append("line")
            .attr("stroke", "#AAA")
            .attr("stroke-width", "2")
            .attr("x1", radius+5)
            .attr("y1", "0px")
            .attr("x2", radius+13)
            .attr("y2", "0px")

        nodeEnter.append("line")
            .attr("stroke", "#AAA")
            .attr("stroke-width", "2")
            .attr("x1", radius + 9)
            .attr("y1", "-4px")
            .attr("x2", radius + 9)
            .attr("y2", "4px")

        // trasparent circle to bind the click
        nodeEnter.append("circle")
            .attr("r", radius)
            .attr("cx", radius + 9)
            .attr("cy", "0px")
            .style("fill-opacity", 0)
            .style("opacity", 0)
            .call(add_node);

        // minus sign
        nodeEnter.append("line")
            .attr("stroke", "#AAA")
            .attr("stroke-width", "2")
            .attr("x1", radius -33 )
            .attr("y1", "0px")
            .attr("x2", radius -25)
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
        this.on("click", function(parent) {
            var child = {"name": "TEST"};
            console.log("parent=" + parent)

            if(parent.children)
            {
                console.log("push");
                parent.children.push(child);
            }
            else {
                console.log("array");
                parent.children = [child];
            }
            update(parent);
        });
    }


    function remove_node(d)
    {
        console.log("remove node");
        if (d.parent && d.parent.children)
        {
            console.log('removing ' + d.name);
            if (d){
                d.parent.children = null
            }
        }
    //    this.on("click", function(d){
    //        update();
    //    });
    }

}