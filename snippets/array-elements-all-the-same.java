
  
  public String checkWin(){
  
        //check if all the elements are the same
        //Hashsets probably more efficient
        
        String win = " ";
        int count = 0;
        for(int i=0; i < this.slots.length-1;i++){
            if (slots[i].equals(slots[0])){
                count +=1;
            }
        }
        
        if(count == this.slots.length+1){
            win = "total";
        } 
        return win;
    }
