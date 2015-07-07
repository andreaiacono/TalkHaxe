package haxe;

class Test {

    static public function main() {
        var test = new Test('{ "name" : "test", [ {"name": "child1"}, { "name":"child2"}]};');
    }

    var root: Node;

    public function new(jsonData: String) {
        root = haxe.Json.parse(jsonData);
        trace("name=" + root.name);
        trace("children=" + root.children[0]);
    }
}
