public class polygon {

    public static void main(String[] args){
      System.out.println("Soll das regelmäßige ploygon 5, 8, 10, 14, 18 oder 27 Ecken haben?")
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();

      switch(input){
      case 5:
          System.out.println("<polygon points=\"50,60 36,41 14,48 14,72 36,79\" style=\"fill:yellow;stroke:purple;stroke-width:1\"/>");
          break;
      case 8:
          System.out.println("<polygon points=\"90,120 81,99 60,90 39,99 30,120 39,141 60,150 81,141\" style=\"fill:yellow;stroke:purple;stroke-width:1\"/>");
          break;
      case 10:
          System.out.println("<polygon points=\"45,200 42,191 35,186 25,186 18,191 15,200 18,209 25,214 35,214 42,209\" style=\"fill:yellow;stroke:purple;stroke-width:1\"/>");
          break;
      case 14:
          System.out.println("<polygon points=\"625,50 623,39 616,30 606,26 594,26 584,30 577,39 575,50 577,61 584,70 594,74 606,74 616,70 623,61\"
                              style=\"fill:yellow;stroke:purple;stroke-width:1\"/>");
          break;
      case 18:
          System.out.println("<polygon points=\"583,75 581,64 575,54 567,46 556,43 544,43 534,46 525,54 519,64 517,75 519,86 525,96 534,104 544,107 556,107 567,104 575,96 581,86\"
                              style=\"fill:yellow;stroke:purple;stroke-width:1\"/>");
          break;
      case 27:
          System.out.println("<polygon points=\"627,175 626,169 624,163 621,158 616,153 611,150 605,148 598,148 592,149 587,151 581,155 577,160 575,166 573,172
                            573,178 575,184 577,190 581,195 587,199 592,201 598,202 605,202 611,200 616,197 621,192 624,187 626,181\"
                            style=\"fill:yellow;stroke:purple;stroke-width:1\"/>");
          break;
      default:
          System.out.println("Error: Gebe entweder 5, 8, 10, 14, 18 oder 27 ein!");
      }



    }



}
