package board;

import characters.Character;

public class EmptyCase implements Case {

    @Override
    public String interact(Character character) {
        System.out.println("You enter an empty room. There's nothing there but rubbish and odds and ends.\n");
        return "emptycase";
    }
}
