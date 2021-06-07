package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* access modifiers changed from: package-private */
/* renamed from: dkj  reason: default package */
/* compiled from: PG */
public final class dkj {
    public static final dkx a = a(false);
    public static final dkx b = a(true);
    public static final dkx c = new dkx((byte) 0);
    private static final Class d = a();

    public static void a(Class cls) {
        if (!dih.class.isAssignableFrom(cls) && d != null && !d.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void a(int i, List list, dlt dlt, boolean z) {
        int i2 = 0;
        if (!(list == null || list.isEmpty())) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).doubleValue();
                    i3 += dhn.f();
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.a(((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.a(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
        }
    }

    public static void b(int i, List list, dlt dlt, boolean z) {
        int i2 = 0;
        if (!(list == null || list.isEmpty())) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).floatValue();
                    i3 += dhn.e();
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.a(((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.a(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
        }
    }

    public static void c(int i, List list, dlt dlt, boolean z) {
        int i2 = 0;
        if (!(list == null || list.isEmpty())) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += dhn.d(((Long) list.get(i4)).longValue());
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.a(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.a(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void d(int i, List list, dlt dlt, boolean z) {
        int i2 = 0;
        if (!(list == null || list.isEmpty())) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += dhn.e(((Long) list.get(i4)).longValue());
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.a(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.a(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void e(int i, List list, dlt dlt, boolean z) {
        int i2 = 0;
        if (!(list == null || list.isEmpty())) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += dhn.f(((Long) list.get(i4)).longValue());
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.b(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.b(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void f(int i, List list, dlt dlt, boolean z) {
        int i2 = 0;
        if (!(list == null || list.isEmpty())) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    i3 += dhn.c();
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.c(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.c(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void g(int i, List list, dlt dlt, boolean z) {
        int i2 = 0;
        if (!(list == null || list.isEmpty())) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    i3 += dhn.d();
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.c(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.c(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void h(int i, List list, dlt dlt, boolean z) {
        int i2 = 0;
        if (!(list == null || list.isEmpty())) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += dhn.n(((Integer) list.get(i4)).intValue());
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.b(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.b(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void i(int i, List list, dlt dlt, boolean z) {
        int i2 = 0;
        if (!(list == null || list.isEmpty())) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += dhn.o(((Integer) list.get(i4)).intValue());
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.c(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.c(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void j(int i, List list, dlt dlt, boolean z) {
        int i2 = 0;
        if (!(list == null || list.isEmpty())) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += dhn.p(((Integer) list.get(i4)).intValue());
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.d(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.d(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void k(int i, List list, dlt dlt, boolean z) {
        int i2 = 0;
        if (!(list == null || list.isEmpty())) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    i3 += dhn.a();
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.e(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.e(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void l(int i, List list, dlt dlt, boolean z) {
        int i2 = 0;
        if (!(list == null || list.isEmpty())) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    i3 += dhn.b();
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.e(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.e(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void m(int i, List list, dlt dlt, boolean z) {
        int i2 = 0;
        if (!(list == null || list.isEmpty())) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += dhn.q(((Integer) list.get(i4)).intValue());
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.b(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.b(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void n(int i, List list, dlt dlt, boolean z) {
        int i2 = 0;
        if (!(list == null || list.isEmpty())) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).booleanValue();
                    i3 += dhn.g();
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.a(((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.a(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    public static void a(int i, List list, dlt dlt) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (list instanceof diz) {
                diz diz = (diz) list;
                while (i2 < list.size()) {
                    Object b2 = diz.b(i2);
                    if (b2 instanceof String) {
                        dlt.a.a(i, (String) b2);
                    } else {
                        dlt.a.a(i, (dha) b2);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.a(i, (String) list.get(i2));
                i2++;
            }
        }
    }

    public static void b(int i, List list, dlt dlt) {
        if (!(list == null || list.isEmpty())) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                dlt.a.a(i, (dha) list.get(i2));
            }
        }
    }

    public static void a(int i, List list, dlt dlt, dkh dkh) {
        if (!(list == null || list.isEmpty())) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                dlt.a(i, list.get(i2), dkh);
            }
        }
    }

    public static void b(int i, List list, dlt dlt, dkh dkh) {
        if (!(list == null || list.isEmpty())) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                dlt.b(i, list.get(i2), dkh);
            }
        }
    }

    static int a(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof djd) {
            djd djd = (djd) list;
            int i2 = 0;
            while (i2 < size) {
                int d2 = dhn.d(djd.b(i2)) + i;
                i2++;
                i = d2;
            }
            return i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += dhn.d(((Long) list.get(i4)).longValue());
        }
        return i3;
    }

    static int a(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return a(list) + (list.size() * dhn.m(i));
    }

    static int b(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof djd) {
            djd djd = (djd) list;
            int i2 = 0;
            while (i2 < size) {
                int e = dhn.e(djd.b(i2)) + i;
                i2++;
                i = e;
            }
            return i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += dhn.e(((Long) list.get(i4)).longValue());
        }
        return i3;
    }

    static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * dhn.m(i)) + b(list);
    }

    static int c(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof djd) {
            djd djd = (djd) list;
            int i2 = 0;
            while (i2 < size) {
                int f = dhn.f(djd.b(i2)) + i;
                i2++;
                i = f;
            }
            return i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += dhn.f(((Long) list.get(i4)).longValue());
        }
        return i3;
    }

    static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * dhn.m(i)) + c(list);
    }

    static int d(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof dil) {
            dil dil = (dil) list;
            int i2 = 0;
            while (i2 < size) {
                int q = dhn.q(dil.c(i2)) + i;
                i2++;
                i = q;
            }
            return i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += dhn.q(((Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * dhn.m(i)) + d(list);
    }

    static int e(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof dil) {
            dil dil = (dil) list;
            int i2 = 0;
            while (i2 < size) {
                int n = dhn.n(dil.c(i2)) + i;
                i2++;
                i = n;
            }
            return i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += dhn.n(((Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    static int e(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * dhn.m(i)) + e(list);
    }

    static int f(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof dil) {
            dil dil = (dil) list;
            int i2 = 0;
            while (i2 < size) {
                int o = dhn.o(dil.c(i2)) + i;
                i2++;
                i = o;
            }
            return i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += dhn.o(((Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * dhn.m(i)) + f(list);
    }

    static int g(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof dil) {
            dil dil = (dil) list;
            int i2 = 0;
            while (i2 < size) {
                int p = dhn.p(dil.c(i2)) + i;
                i2++;
                i = p;
            }
            return i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += dhn.p(((Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * dhn.m(i)) + g(list);
    }

    static int h(List list) {
        return list.size() << 2;
    }

    static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * dhn.f(i);
    }

    static int i(List list) {
        return list.size() << 3;
    }

    static int i(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * dhn.h(i);
    }

    static int j(List list) {
        return list.size();
    }

    static int j(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * dhn.l(i);
    }

    static int k(int i, List list) {
        int b2;
        int b3;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m = dhn.m(i) * size;
        if (list instanceof diz) {
            diz diz = (diz) list;
            int i2 = 0;
            while (i2 < size) {
                Object b4 = diz.b(i2);
                if (b4 instanceof dha) {
                    b3 = dhn.b((dha) b4);
                } else {
                    b3 = dhn.b((String) b4);
                }
                i2++;
                m = b3 + m;
            }
            return m;
        }
        int i3 = 0;
        while (i3 < size) {
            Object obj = list.get(i3);
            if (obj instanceof dha) {
                b2 = dhn.b((dha) obj);
            } else {
                b2 = dhn.b((String) obj);
            }
            i3++;
            m = b2 + m;
        }
        return m;
    }

    static int a(int i, Object obj, dkh dkh) {
        if (obj instanceof dix) {
            return dhn.a(i, (dix) obj);
        }
        return dhn.b(i, (djo) obj, dkh);
    }

    static int a(int i, List list, dkh dkh) {
        int b2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m = dhn.m(i) * size;
        int i2 = 0;
        while (i2 < size) {
            Object obj = list.get(i2);
            if (obj instanceof dix) {
                b2 = dhn.a((dix) obj);
            } else {
                b2 = dhn.b((djo) obj, dkh);
            }
            i2++;
            m = b2 + m;
        }
        return m;
    }

    static int l(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m = size * dhn.m(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            m += dhn.b((dha) list.get(i2));
        }
        return m;
    }

    static int b(int i, List list, dkh dkh) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += dhn.c(i, (djo) list.get(i3), dkh);
        }
        return i2;
    }

    private static dkx a(boolean z) {
        try {
            Class b2 = b();
            if (b2 == null) {
                return null;
            }
            return (dkx) b2.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable th) {
            return null;
        }
    }

    private static Class a() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable th) {
            return null;
        }
    }

    private static Class b() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable th) {
            return null;
        }
    }

    static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static void a(Object obj, Object obj2, long j) {
        dlc.a(obj, j, djk.a(dlc.f(obj, j), dlc.f(obj2, j)));
    }

    static void a(dhy dhy, Object obj, Object obj2) {
        dia dia = ((dij) obj2).a;
        if (!dia.a.isEmpty()) {
            dia a2 = dhy.a(obj);
            for (int i = 0; i < dia.a.b(); i++) {
                a2.a(dia.a.b(i));
            }
            for (Map.Entry entry : dia.a.c()) {
                a2.a(entry);
            }
        }
    }

    static void a(dkx dkx, Object obj, Object obj2) {
        dky dky = ((dih) obj).s;
        dky dky2 = ((dih) obj2).s;
        if (!dky2.equals(dky.a)) {
            dky = dky.a(dky, dky2);
        }
        dkx.a(obj, dky);
    }

    static Object a(int i, List list, dio dio, Object obj, dkx dkx) {
        Object obj2;
        Object a2;
        int i2;
        if (dio == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            int i4 = 0;
            obj2 = obj;
            while (i3 < size) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (dio.a(intValue) != null) {
                    if (i3 != i4) {
                        list.set(i4, Integer.valueOf(intValue));
                    }
                    i2 = i4 + 1;
                    a2 = obj2;
                } else {
                    a2 = a(i, intValue, obj2, dkx);
                    i2 = i4;
                }
                i3++;
                obj2 = a2;
                i4 = i2;
            }
            if (i4 != size) {
                list.subList(i4, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (dio.a(intValue2) == null) {
                    obj = a(i, intValue2, obj, dkx);
                    it.remove();
                }
            }
            obj2 = obj;
        }
        return obj2;
    }

    static Object a(int i, int i2, Object obj, dkx dkx) {
        if (obj == null) {
            obj = new dky();
        }
        dkx.a(obj, i, (long) i2);
        return obj;
    }
}
