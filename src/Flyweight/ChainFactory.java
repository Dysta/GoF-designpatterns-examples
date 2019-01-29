package Flyweight;

import java.util.HashMap;

public class ChainFactory {
    private HashMap<ChainType,Chain> map;

    ChainFactory(){
        map = new HashMap<>();
    }

    Chain getChain(ChainType chainType){
        Chain chain = map.get(chainType);
        if(chain == null){
            if(chainType.equals(ChainType.X)) {
                chain =  new XChain();
            }
            else chain = new OChain();
            map.put(chainType, chain);
            System.out.println("Chain " + chainType + " type created!");
        }
        return chain;
    }

    public static enum ChainType{
        X,Y
    }
}
