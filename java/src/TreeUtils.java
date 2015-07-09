import haxe.HaxeTree;

public class TreeUtils {

    public static void main(String[] args) {

        String jsonTree = "{ \"name\" : \"test\", \"value\": 13, \"children\": [ {\"name\" : \"child1\", \"value\": 26}, {\"name\" : \"child2\", \"value\": 224, \"children\": [{\"name\" : \"child3\", \"value\": 25}, {\"name\" : \"child4\", \"value\": 22} ]} ] }";
        HaxeTree haxeTree = new HaxeTree(jsonTree);

        System.err.println("Best Value=" + haxeTree.getBestValue());
    }

}
