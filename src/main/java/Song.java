/*
 * Song class for MediaLibrary
 */
public class Song
{
    private String title;
    private int rating;

    public Song(String t)
    {
        title = t;
        rating = 0;
    }

    public String getTitle()
    {
        return title;
    }

    public int getRating()
    {
        return rating;
    }

    public void setTitle(String t)
    {
        title = t;
    }

    public void adjustRating(int r)
    {
        if (r >= 0 && r <= 10)
        {
            rating = r;
        }
    }

    public String toString()
    {
        String info = "\"" + title + "\"";
        if (rating != 0)
        {
            info += ", rating is " + rating;
        }
        return info;
    }

    public boolean equals(Song s)
    {
        return this.title.equals(s.title);
    }
}
