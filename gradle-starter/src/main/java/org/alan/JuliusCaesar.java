package org.alan;

import java.util.List;

public class JuliusCaesar {

    public List<String> juliusCaesar() {
        String juliusCaesarActIII = "Antony speaks over Caesar's body\n" +
                "O, pardon me, thou bleeding piece of earth,\n" +
                "That I am meek and gentle with these butchers!\n" +
                "Thou art the ruins of the noblest man\n" +
                "That ever lived in the tide of times.\n" +
                "Woe to the hand that shed this costly blood!\n" +
                "Over thy wounds now do I prophesy,—\n" +
                "Which, like dumb mouths, do ope their ruby lips,\n" +
                "To beg the voice and utterance of my tongue—\n" +
                "A curse shall light upon the limbs of men;\n" +
                "Domestic fury and fierce civil strife\n" +
                "Shall cumber all the parts of Italy;\n" +
                "Blood and destruction shall be so in use\n" +
                "And dreadful objects so familiar\n" +
                "That mothers shall but smile when they behold\n" +
                "Their infants quarter'd with the hands of war;\n" +
                "All pity choked with custom of fell deeds:\n" +
                "And Caesar's spirit, ranging for revenge,\n" +
                "With Ate by his side come hot from hell,\n" +
                "Shall in these confines with a monarch's voice\n" +
                "Cry 'Havoc,' and let slip the dogs of war;\n" +
                "That this foul deed shall smell above the earth\n" +
                "With carrion men, groaning for burial.";

        return juliusCaesarActIII.lines().toList();
    }

    public void emit(List<String> lines) {
        lines.forEach(System.out::println);
    }
}
