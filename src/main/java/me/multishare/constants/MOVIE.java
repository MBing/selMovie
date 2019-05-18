package me.multishare.constants;

import static me.multishare.helpers.Helpers.getTestID;

public class MOVIE {
    public static final String ROOT = getTestID("movie");
    public static final String NAVIGATION = getTestID("navigation");
    public static final String NAVIGATION_CONTENT = getTestID("navigation-content");
    public static final String NAVIGATION_HOME = getTestID("navigation--home");
    public static final String LINK = getTestID("moviethumb-link--" + GLOBAL.MOVIEID);
    public static final String INFO = getTestID("movieinfo");
    public static final String INFOBAR = getTestID("movieinfobar");
    public static final String ACTORS_GRID = getTestID("actors-grid");
}
