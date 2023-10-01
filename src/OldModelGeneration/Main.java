package OldModelGeneration;

import java.util.ArrayList;

public class Main {
    ArrayList<Block> blockchain = new ArrayList<>();

    public static void main(String[] args) {
        String[] genesisTransactions = {"Prashant Jadon","21BCA1152@cuchd.in","20"};
        Block genesisBlock = new Block(0,genesisTransactions);

        String[] genesisTransactions2 = {"Archita","21BCA1178@cuchd.in","20"};
        Block genesisBlock2 = new Block(genesisBlock.getBlockHash(),genesisTransactions2);

        String[] genesisTransactions3 = {"Alisha","21BCA1162@cuchd.in","20"};
        Block genesisBlock3 = new Block(genesisBlock.getBlockHash(),genesisTransactions3);

        System.out.println("Hash Of Genesis OldModelGeneration.Block:");
        System.out.println(genesisBlock.getBlockHash());
        System.out.println("Hash of OldModelGeneration.Block 2");
        System.out.println(genesisBlock2.getBlockHash());
        System.out.println("Hash of OldModelGeneration.Block 3");
        System.out.println(genesisBlock3.getBlockHash());

    }
}