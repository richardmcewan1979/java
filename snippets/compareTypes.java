//context playing with simplified BlackJack. 
//suit and rank don't matter in that game but do in other card games or analogous contexts

//snippet example of comparing two types which have hierachy of indepndent attributes
//use case : a partially ordered set e.g. ace_spades vs ace_clubs (or 2S vs 3H or 4H vs 4S)
//these are comparing instance variables
//class method

 public int compareTo(Card that){
        if(this.suit < that.suit){
            return -1;
        }
        if(this.suit < that.suit){
            return 1;
        }
        if(this.rank < that.rank){
            return -1;
        }
        if(this.rank > that.rank){
            return 1;
        }
        return 0;
    }
    
//main class

 /*
 
 //note initialise some instances of card class
 //with attributes type int : rank & suit
 //encodings can be converted via a class toString() method to provide user output
 
        System.out.println("check.....");
        System.out.println(aceOfHearts.compareTo(aceOfSpades));
        System.out.println(twoOfClubs.compareTo(twoOfDiamonds));
        
        
 */
