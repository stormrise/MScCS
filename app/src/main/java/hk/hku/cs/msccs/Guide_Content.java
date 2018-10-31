package hk.hku.cs.msccs;

public class Guide_Content {
    private String title;
    private String text;
    private String pic;
    private String url;

    public Guide_Content(String title, String text,String pic,String url){
        this.title=title;
        this.text=text;
        this.pic=pic;
        this.url=url;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
