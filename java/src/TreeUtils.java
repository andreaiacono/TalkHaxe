import haxe.HaxeTree;

public class TreeUtils {

    public static void main(String[] args) {

        HaxeTree haxeTree = new HaxeTree("{ \"name\" : \"test\", \"children\": [ {\"name\" : \"child1\"}, {\"name\" : \"child2\", \"children\": [{\"name\" : \"child3\"}, {\"name\" : \"child4\"} ]} ] }");
        Object node = haxeTree.findNode("child4");
        System.err.println("Node=" + node);
    }

}
