package dz.algeev.music;

public class Music {
    public String name;
    public String author;
    public String author2;
    public Album album;


     public Music(String name, String author, Album album){
        this.name = name;
        this.author = author;
        this.album = album;
    }
    public Music(String name,String author2){
         this.name = name;
         this.author2 = author2;
    }
    public Music(String name){
         this.name = name;
    }
    public String toString(){
        if(album.nameA!=null){
            author=album.nameA;
        }
        if (author2==null){
            return name + ", автор:" + author;
        }
        return name + ", авторы:" + author + ", " + author2;
    }
    public void setAlbum(Album album){
        this.album = album;
    }
}
