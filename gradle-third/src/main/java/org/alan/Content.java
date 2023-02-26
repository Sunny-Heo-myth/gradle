package org.alan;

import java.util.List;

public class Content {

    public List<String> writeContent() {
        String juliusCaesarActIII = """
            Antony speaks over Caesar's body
            O, pardon me, thou bleeding piece of earth,
            That I am meek and gentle with these butchers!
            Thou art the ruins of the noblest man
            That ever lived in the tide of times.
            Woe to the hand that shed this costly blood!
            Over thy wounds now do I prophesy,—
            Which, like dumb mouths, do ope their ruby lips,
            To beg the voice and utterance of my tongue—
            A curse shall light upon the limbs of men;
            Domestic fury and fierce civil strife
            Shall cumber all the parts of Italy;
            Blood and destruction shall be so in use
            And dreadful objects so familiar
            That mothers shall but smile when they behold
            Their infants quarter'd with the hands of war;
            All pity choked with custom of fell deeds:
            And Caesar's spirit, ranging for revenge,
            With Ate by his side come hot from hell,
            Shall in these confines with a monarch's voice
            Cry 'Havoc,' and let slip the dogs of war;
            That this foul deed shall smell above the earth
            With carrion men, groaning for burial.""";
        return juliusCaesarActIII.lines().toList();
    }
}
