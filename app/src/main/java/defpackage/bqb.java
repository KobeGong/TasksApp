package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: bqb  reason: default package */
/* compiled from: PG */
public class bqb {
    public static final AtomicBoolean a = new AtomicBoolean();
    private static final Uri b = Uri.parse("content://com.google.android.gsf.gservices");
    private static final Uri c = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    private static final Pattern d = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    private static final Pattern e = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static HashMap f;
    private static final HashMap g = new HashMap();
    private static final HashMap h = new HashMap();
    private static final HashMap i = new HashMap();
    private static final HashMap j = new HashMap();
    private static Object k;
    private static boolean l;
    private static String[] m = new String[0];

    private static void a(ContentResolver contentResolver) {
        if (f == null) {
            a.set(false);
            f = new HashMap();
            k = new Object();
            l = false;
            contentResolver.registerContentObserver(b, true, new bqc());
        } else if (a.getAndSet(false)) {
            f.clear();
            g.clear();
            h.clear();
            i.clear();
            j.clear();
            k = new Object();
            l = false;
        }
    }

    private static String b(ContentResolver contentResolver, String str) {
        String str2 = null;
        synchronized (bqb.class) {
            a(contentResolver);
            Object obj = k;
            if (f.containsKey(str)) {
                String str3 = (String) f.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            } else {
                String[] strArr = m;
                int length = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        Cursor query = contentResolver.query(b, null, null, new String[]{str}, null);
                        if (query != null) {
                            try {
                                if (query.moveToFirst()) {
                                    String string = query.getString(1);
                                    if (string != null && string.equals(null)) {
                                        string = null;
                                    }
                                    a(obj, str, string);
                                    if (string != null) {
                                        str2 = string;
                                    }
                                    if (query != null) {
                                        query.close();
                                    }
                                }
                            } catch (Throwable th) {
                                if (query != null) {
                                    query.close();
                                }
                                throw th;
                            }
                        }
                        a(obj, str, (String) null);
                        if (query != null) {
                            query.close();
                        }
                    } else if (!str.startsWith(strArr[i2])) {
                        i2++;
                    } else if (!l || f.isEmpty()) {
                        f.putAll(a(contentResolver, m));
                        l = true;
                        if (f.containsKey(str)) {
                            String str4 = (String) f.get(str);
                            if (str4 != null) {
                                str2 = str4;
                            }
                        }
                    }
                }
            }
        }
        return str2;
    }

    private static void a(Object obj, String str, String str2) {
        synchronized (bqb.class) {
            if (obj == k) {
                f.put(str, str2);
            }
        }
    }

    public static long a(ContentResolver contentResolver, String str) {
        Long l2;
        long j2;
        Object b2 = b(contentResolver);
        Long l3 = (Long) a(i, str, (Object) -1L);
        if (l3 != null) {
            return l3.longValue();
        }
        String b3 = b(contentResolver, str);
        if (b3 == null) {
            l2 = l3;
            j2 = -1;
        } else {
            try {
                long parseLong = Long.parseLong(b3);
                l2 = Long.valueOf(parseLong);
                j2 = parseLong;
            } catch (NumberFormatException e2) {
                l2 = l3;
                j2 = -1;
            }
        }
        a(b2, i, str, l2);
        return j2;
    }

    public static boolean a(ContentResolver contentResolver, String str, boolean z) {
        Object b2 = b(contentResolver);
        Boolean bool = (Boolean) a(g, str, Boolean.valueOf(z));
        if (bool != null) {
            return bool.booleanValue();
        }
        String b3 = b(contentResolver, str);
        if (b3 != null && !b3.equals("")) {
            if (d.matcher(b3).matches()) {
                bool = true;
                z = true;
            } else if (e.matcher(b3).matches()) {
                bool = false;
                z = false;
            } else {
                Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + b3 + "\") as boolean");
            }
        }
        a(b2, g, str, bool);
        return z;
    }

    private static Map a(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(c, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    treeMap.put(query.getString(0), query.getString(1));
                } finally {
                    query.close();
                }
            }
        }
        return treeMap;
    }

    private static Object b(ContentResolver contentResolver) {
        Object obj;
        synchronized (bqb.class) {
            a(contentResolver);
            obj = k;
        }
        return obj;
    }

    private static Object a(HashMap hashMap, String str, Object obj) {
        synchronized (bqb.class) {
            if (!hashMap.containsKey(str)) {
                return null;
            }
            Object obj2 = hashMap.get(str);
            if (obj2 == null) {
                obj2 = obj;
            }
            return obj2;
        }
    }

    private static void a(Object obj, HashMap hashMap, String str, Object obj2) {
        synchronized (bqb.class) {
            if (obj == k) {
                hashMap.put(str, obj2);
                f.remove(str);
            }
        }
    }
}