package haxe;

class HaxeTree {

    var root: Node;

    public function new(jsonData: String) {
        root = haxe.Json.parse(jsonData);
        trace("name=" + root.name);
        if (root.children != null) {
            trace("first children=" + root.children[0]);
        }
        else {
            trace("no children");
        }
    }
}
