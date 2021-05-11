package Task6.Prototype;

public class CookieMachine {
    private Cookie cookie;

    public CookieMachine(Cookie cookie){
        this.cookie = cookie;
    }

    public Cookie makeCookie() throws CloneNotSupportedException{
        return (Cookie) this.cookie.clone();
    }
}
