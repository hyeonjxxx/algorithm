import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<players.length; i++){            
            map.put(players[i], i);
        }
        
        for(String runner : callings){
            int rank = map.get(runner);
            String aheadPlayer = players[rank-1];
            
            players[rank-1] = runner;
            players[rank] = aheadPlayer;            
            
            map.put(runner, rank-1);
            map.put(aheadPlayer, rank);
            
        }
        
        return players;
    }
}