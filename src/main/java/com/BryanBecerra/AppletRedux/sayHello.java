
package com.BryanBecerra.AppletRedux;

public class sayHello {
    private int x;
    private int y;

    public sayHello(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public String now() {
        var theWord = new StringBuilder();
        var openingTag = "<h1 style=\"position:absolute; left:" + x + "px; top:" + y + "px;\">";
        theWord.append(openingTag);
        theWord.append("Hello");
        theWord.append("</h1>");
        return theWord.toString();
    }
}
