package a1126.game1;

public class Raichu extends Pikachu{
    
    public Raichu(){
        super(200, "슈퍼전기");
    }

    public Raichu(int energy, String type){
        super(energy, type, 20);
    };

    public Raichu(int energy, String type, int level){
        super(energy, type, level);

    }

    @Override
    public String aAttack() {
        return "100만 볼트";
    }

    @Override
    public String bAttack() {
        return "볼트체인지";
    };
    
    public String cAttack(){
      if(level >= 40){
        return "아이언테일";
      }else{
        return "레벨이 낮아 사용불가 X";
      }  
    };

    
}
