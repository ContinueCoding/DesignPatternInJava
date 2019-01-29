package com.huoxy.d5_front_controller_pattern;

public class Dispatcher {

    public static final String HOME_VIEW = "home_view";
    public static final String STUDENT_VIEW = "student_view";

    private HomeView homeView;
    private StudentView studentView;

    public Dispatcher() {
        homeView = new HomeView();
        studentView = new StudentView();
    }

    /**
     * 分发Request
     * @param request HOME_VIEW、STUDENT_VIEW
     */
    public void dispatch(String request) {
        if(HOME_VIEW.equalsIgnoreCase(request)) {
            homeView.show();
        } else if(STUDENT_VIEW.equalsIgnoreCase(request)) {
            studentView.show();
        } else {
            throw new IllegalArgumentException("Invalid request: " + request);
        }
    }
}
