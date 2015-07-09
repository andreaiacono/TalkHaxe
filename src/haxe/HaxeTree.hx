package haxe;

class HaxeTree {

    var root: Node;

    public function new(jsonData: String) {
        root = haxe.Json.parse(jsonData);
    }

    function findNode(name:String) {
        return find(root, name);
    }

    function find(node:Node, name: String) {
        if (node.name == name) {
            return node;
        }

        if (node.children != null) {
            for (child in node.children) {
                var result = find(child, name);
                if (result != null)
                    return result;
            }
        }

        return null;
    }
}
