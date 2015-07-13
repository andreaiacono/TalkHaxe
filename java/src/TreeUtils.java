import haxe.HaxeTree;

public class TreeUtils {

    public static void main(String[] args) {

        String jsonTree = "{ \"value\": 13, \"children\": [ {\"value\": 26}, {\"value\": 42, \"children\": [{\"value\": 71}, {\"value\": 22} ]} ] }";
        HaxeTree haxeTree = new HaxeTree(jsonTree);

        System.err.println("Best Value=" + haxeTree.getBestValue());
    }

}
