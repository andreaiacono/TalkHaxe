package haxe;

class HaxeTree {

    var root:Node;

    public function new(jsonData:String) {
        root = haxe.Json.parse(jsonData);
    }

    function findNode(name:String):Node {
        return find(root, name);
    }

    function find(node:Node, name:String):Node {
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

    function getBestValue():Int {
        return internalGetBestValue(root, 0, 0);
    }

    private function internalGetBestValue(node:Node, level:Int, bestValue:Int):Int {

        if (bestValue < node.value) {
            bestValue = node.value;
        }

        if (node.children != null) {
            for (child in node.children) {
                var value = internalGetBestValue(child, ++level, bestValue);
                if (value > bestValue) {
                    bestValue = value;
                }
            }
        }

        return bestValue;
    }

}
