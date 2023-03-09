package controller;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.03.09   Hadian
 */
@WebListener
public class SessionMonitor implements HttpSessionListener {
    private static int ONLINE;
    private static int VISIT;
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        VISIT++;
        ONLINE++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        ONLINE--;
    }

    public static int getONLINE() {
        return ONLINE;
    }

    public static int getVISIT() {
        return VISIT;
    }
}
