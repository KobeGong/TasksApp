package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
/* renamed from: dzh  reason: default package */
/* compiled from: PG */
public final class dzh {
    private static final Logger a = Logger.getLogger(dzh.class.getName());
    private static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));

    private dzh() {
    }

    static String a(Map map) {
        if (map.containsKey("loadBalancingPolicy")) {
            return d(map, "loadBalancingPolicy");
        }
        return null;
    }

    static dyt a(Map map, int i) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (map != null && map.containsKey("methodConfig")) {
            List a2 = a(map, "methodConfig");
            for (int i2 = 0; i2 < a2.size(); i2++) {
                Map a3 = a(a2, i2);
                if (a3.containsKey("retryPolicy")) {
                    Map b2 = b(a3, "retryPolicy");
                    int min = Math.min(c(b2, "maxAttempts").intValue(), i);
                    String d = d(b2, "initialBackoff");
                    cld.b(d.charAt(d.length() + -1) == 's', "invalid value of initialBackoff");
                    double parseDouble = Double.parseDouble(d.substring(0, d.length() - 1));
                    String d2 = d(b2, "maxBackoff");
                    cld.b(d2.charAt(d2.length() + -1) == 's', "invalid value of maxBackoff");
                    double parseDouble2 = Double.parseDouble(d2.substring(0, d2.length() - 1));
                    double doubleValue = c(b2, "backoffMultiplier").doubleValue();
                    List a4 = a(b2, "retryableStatusCodes");
                    HashSet hashSet = new HashSet(a4.size());
                    for (int i3 = 0; i3 < a4.size(); i3++) {
                        hashSet.add(dpx.a(b(a4, i3)));
                    }
                    dyu dyu = new dyu(min, parseDouble, parseDouble2, doubleValue, hashSet);
                    List a5 = a(a3, "name");
                    for (int i4 = 0; i4 < a5.size(); i4++) {
                        Map a6 = a(a5, i4);
                        String d3 = d(a6, "service");
                        if (a6.containsKey("method")) {
                            hashMap.put(dpb.a(d3, d(a6, "method")), dyu);
                        } else {
                            hashMap2.put(d3, dyu);
                        }
                    }
                }
            }
        }
        return new dyt(hashMap, hashMap2);
    }

    static dzb b(Map map) {
        boolean z;
        boolean z2 = true;
        if (map == null || !map.containsKey("retryThrottling")) {
            return null;
        }
        Map b2 = b(map, "retryThrottling");
        float floatValue = c(b2, "maxTokens").floatValue();
        float floatValue2 = c(b2, "tokenRatio").floatValue();
        if (floatValue > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        cld.b(z, "maxToken should be greater than zero");
        if (floatValue2 <= 0.0f) {
            z2 = false;
        }
        cld.b(z2, "tokenRatio should be greater than zero");
        return new dzb(floatValue, floatValue2);
    }

    static Map a(Map map, Random random, String str) {
        boolean z;
        boolean z2 = true;
        for (Map.Entry entry : map.entrySet()) {
            cky.a(b.contains(entry.getKey()), "Bad key: %s", entry);
        }
        if (map.containsKey("clientLanguage")) {
            List a2 = a(map, "clientLanguage");
            if (!a2.isEmpty()) {
                int i = 0;
                while (true) {
                    if (i >= a2.size()) {
                        z = false;
                        break;
                    } else if ("java".equals(b(a2, i).toLowerCase(Locale.ROOT))) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z) {
                    return null;
                }
            }
        }
        if (map.containsKey("percentage")) {
            int intValue = c(map, "percentage").intValue();
            cky.a(intValue >= 0 && intValue <= 100, "Bad percentage", map.get("percentage"));
            if (random.nextInt(100) >= intValue) {
                return null;
            }
        }
        if (map.containsKey("clientHostname")) {
            List a3 = a(map, "clientHostname");
            if (!a3.isEmpty()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= a3.size()) {
                        z2 = false;
                        break;
                    } else if (b(a3, i2).equals(str)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z2) {
                    return null;
                }
            }
        }
        return b(map, "serviceConfig");
    }

    static List a(List list) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.startsWith("_grpc_config=")) {
                try {
                    Object a2 = dwb.a(str2.substring(13));
                    if (!(a2 instanceof List)) {
                        String valueOf = String.valueOf(a2);
                        throw new IOException(new StringBuilder(String.valueOf(valueOf).length() + 10).append("wrong type").append(valueOf).toString());
                    }
                    List<Object> list2 = (List) a2;
                    for (Object obj : list2) {
                        if (!(obj instanceof Map)) {
                            String valueOf2 = String.valueOf(a2);
                            throw new IOException(new StringBuilder(String.valueOf(valueOf2).length() + 18).append("wrong element type").append(valueOf2).toString());
                        }
                    }
                    arrayList.addAll(list2);
                } catch (IOException e) {
                    Logger logger = a;
                    Level level = Level.WARNING;
                    String valueOf3 = String.valueOf(str2);
                    if (valueOf3.length() != 0) {
                        str = "Bad service config: ".concat(valueOf3);
                    } else {
                        str = new String("Bad service config: ");
                    }
                    logger.logp(level, "io.grpc.internal.ServiceConfigUtil", "parseTxtResults", str, (Throwable) e);
                }
            } else {
                a.logp(Level.FINE, "io.grpc.internal.ServiceConfigUtil", "parseTxtResults", "Ignoring non service config {0}", new Object[]{str2});
            }
        }
        return arrayList;
    }

    private static List a(Map map, String str) {
        Object a2 = cld.a(map.get(str), "no such key %s", str);
        if (a2 instanceof List) {
            return (List) a2;
        }
        throw new ClassCastException(String.format("value %s for key %s in %s is not List", a2, str, map));
    }

    private static Map b(Map map, String str) {
        Object a2 = cld.a(map.get(str), "no such key %s", str);
        if (a2 instanceof Map) {
            return (Map) a2;
        }
        throw new ClassCastException(String.format("value %s for key %s in %s is not object", a2, str, map));
    }

    private static Map a(List list, int i) {
        Object a2 = cld.a(list.get(i), "idx %s in %s is null", i, list);
        if (a2 instanceof Map) {
            return (Map) a2;
        }
        throw new ClassCastException(String.format("value %s for idx %d in %s is not a map", a2, Integer.valueOf(i), list));
    }

    private static Double c(Map map, String str) {
        Object a2 = cld.a(map.get(str), "no such key %s", str);
        if (a2 instanceof Double) {
            return (Double) a2;
        }
        throw new ClassCastException(String.format("value %s for key %s in %s is not Double", a2, str, map));
    }

    private static String d(Map map, String str) {
        Object a2 = cld.a(map.get(str), "no such key %s", str);
        if (a2 instanceof String) {
            return (String) a2;
        }
        throw new ClassCastException(String.format("value %s for key %s in %s is not String", a2, str, map));
    }

    private static String b(List list, int i) {
        Object a2 = cld.a(list.get(i), "idx %s in %s is null", i, list);
        if (a2 instanceof String) {
            return (String) a2;
        }
        throw new ClassCastException(String.format("value %s for idx %d in %s is not String", a2, Integer.valueOf(i), list));
    }
}
