package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.security.AccessControlException;
import java.security.AccessController;
import java.util.MissingResourceException;
import java.util.Properties;

/* renamed from: al  reason: default package */
/* compiled from: PG */
public final class al {
    private static final Properties a = new Properties();

    public static String a(String str, String str2) {
        String property;
        if (System.getSecurityManager() != null) {
            try {
                property = (String) AccessController.doPrivileged(new am(str));
            } catch (AccessControlException e) {
                property = null;
            }
        } else {
            property = System.getProperty(str);
        }
        if (property == null) {
            return a.getProperty(str, str2);
        }
        return property;
    }

    static {
        InputStream resourceAsStream;
        try {
            if (System.getSecurityManager() != null) {
                resourceAsStream = (InputStream) AccessController.doPrivileged(new ao(an.class, "/android/icumessageformat/ICUConfig.properties"));
            } else {
                resourceAsStream = an.class.getResourceAsStream("/android/icumessageformat/ICUConfig.properties");
            }
            if (resourceAsStream != null) {
                a.load(resourceAsStream);
            }
        } catch (IOException | MissingResourceException e) {
        }
    }
}
