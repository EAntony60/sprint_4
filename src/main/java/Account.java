public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        boolean isCorrespondingLength = false;
        boolean isRightAndLeftSpaces = false;
        boolean result = false;

        if ((name.length() >= 3) && (name.length() <= 19)) {isCorrespondingLength = true;}

        if ((name.indexOf(" ") != 0) && (name.lastIndexOf(" ") != name.length()-1)) {} else { isRightAndLeftSpaces = true;}

        if (isCorrespondingLength && !isRightAndLeftSpaces && ((name.indexOf(" ") > 0) && (name.lastIndexOf(" ") != -1) && (name.lastIndexOf(" ") > 0))) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

}