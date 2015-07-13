package haxe;

@:expose
class HaxeTree {

    public static function main() {}

    var root:Node;

    public function new(jsonData:String) {
        root = haxe.Json.parse(jsonData);
    }

    function findNode(value:Int):Node {
        return find(root, value);
    }

    function find(node:Node, value:Int):Node {
        if (node.value == value) {
            return node;
        }

        if (node.children != null) {
            for (child in node.children) {
                var result = find(child, value);
                if (result != null)
                    return result;
            }
        }

        return null;
    }

    function getBestValue():Int {
        return findBestValue(root, 0, 0);
    }

    private function findBestValue(node:Node, level:Int, bestValue:Int):Int {

        if (bestValue < node.value) {
            bestValue = node.value;
        }

        if (node.children != null) {
            for (child in node.children) {
                var value = findBestValue(child, ++level, bestValue);
                if (value > bestValue) {
                    bestValue = value;
                }
            }
        }

        return bestValue;
    }

}
