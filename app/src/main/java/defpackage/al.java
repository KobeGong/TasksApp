package defpackage;

/* renamed from: al reason: default package */
/* compiled from: PG */
public final class al {
    private static final java.util.Properties a = new java.util.Properties();

    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.lang.String property;
        if (java.lang.System.getSecurityManager() != null) {
            try {
                property = (java.lang.String) java.security.AccessController.doPrivileged(new defpackage.am(str));
            } catch (java.security.AccessControlException e) {
                property = null;
            }
        } else {
            property = java.lang.System.getProperty(str);
        }
        if (property == null) {
            return a.getProperty(str, str2);
        }
        return property;
    }

    static {
        java.io.InputStream resourceAsStream;
        java.lang.String str = "/android/icumessageformat/ICUConfig.properties";
        java.lang.Class<defpackage.an> cls = defpackage.an.class;
        try {
            if (java.lang.System.getSecurityManager() != null) {
                resourceAsStream = (java.io.InputStream) java.security.AccessController.doPrivileged(new defpackage.ao(cls, str));
            } else {
                resourceAsStream = cls.getResourceAsStream(str);
            }
            if (resourceAsStream != null) {
                a.load(resourceAsStream);
            }
        } catch (java.io.IOException | java.util.MissingResourceException e) {
        }
    }
}
