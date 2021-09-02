package defpackage;

/* renamed from: dkj reason: default package */
/* compiled from: PG */
final class dkj {
    public static final defpackage.dkx a = a(false);
    public static final defpackage.dkx b = a(true);
    public static final defpackage.dkx c = new defpackage.dkx(0);
    private static final java.lang.Class d = a();

    public static void a(java.lang.Class cls) {
        if (!defpackage.dih.class.isAssignableFrom(cls) && d != null && !d.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void a(int i, java.util.List list, defpackage.dlt dlt, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((java.lang.Double) list.get(i4)).doubleValue();
                    i3 += defpackage.dhn.f();
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.a(((java.lang.Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.a(i, ((java.lang.Double) list.get(i2)).doubleValue());
                i2++;
            }
        }
    }

    public static void b(int i, java.util.List list, defpackage.dlt dlt, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((java.lang.Float) list.get(i4)).floatValue();
                    i3 += defpackage.dhn.e();
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.a(((java.lang.Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.a(i, ((java.lang.Float) list.get(i2)).floatValue());
                i2++;
            }
        }
    }

    public static void c(int i, java.util.List list, defpackage.dlt dlt, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += defpackage.dhn.d(((java.lang.Long) list.get(i4)).longValue());
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.a(((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.a(i, ((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void d(int i, java.util.List list, defpackage.dlt dlt, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += defpackage.dhn.e(((java.lang.Long) list.get(i4)).longValue());
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.a(((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.a(i, ((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void e(int i, java.util.List list, defpackage.dlt dlt, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += defpackage.dhn.f(((java.lang.Long) list.get(i4)).longValue());
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.b(((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.b(i, ((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void f(int i, java.util.List list, defpackage.dlt dlt, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((java.lang.Long) list.get(i4)).longValue();
                    i3 += defpackage.dhn.c();
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.c(((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.c(i, ((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void g(int i, java.util.List list, defpackage.dlt dlt, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((java.lang.Long) list.get(i4)).longValue();
                    i3 += defpackage.dhn.d();
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.c(((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.c(i, ((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void h(int i, java.util.List list, defpackage.dlt dlt, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += defpackage.dhn.n(((java.lang.Integer) list.get(i4)).intValue());
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.b(((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.b(i, ((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void i(int i, java.util.List list, defpackage.dlt dlt, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += defpackage.dhn.o(((java.lang.Integer) list.get(i4)).intValue());
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.c(((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.c(i, ((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void j(int i, java.util.List list, defpackage.dlt dlt, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += defpackage.dhn.p(((java.lang.Integer) list.get(i4)).intValue());
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.d(((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.d(i, ((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void k(int i, java.util.List list, defpackage.dlt dlt, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((java.lang.Integer) list.get(i4)).intValue();
                    i3 += defpackage.dhn.a();
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.e(((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.e(i, ((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void l(int i, java.util.List list, defpackage.dlt dlt, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((java.lang.Integer) list.get(i4)).intValue();
                    i3 += defpackage.dhn.b();
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.e(((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.e(i, ((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void m(int i, java.util.List list, defpackage.dlt dlt, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += defpackage.dhn.q(((java.lang.Integer) list.get(i4)).intValue());
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.b(((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.b(i, ((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void n(int i, java.util.List list, defpackage.dlt dlt, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                dlt.a.a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((java.lang.Boolean) list.get(i4)).booleanValue();
                    i3 += defpackage.dhn.g();
                }
                dlt.a.c(i3);
                while (i2 < list.size()) {
                    dlt.a.a(((java.lang.Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dlt.a.a(i, ((java.lang.Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    public static void a(int i, java.util.List list, defpackage.dlt dlt) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (list instanceof defpackage.diz) {
                defpackage.diz diz = (defpackage.diz) list;
                while (true) {
                    int i3 = i2;
                    if (i3 < list.size()) {
                        java.lang.Object b2 = diz.b(i3);
                        if (b2 instanceof java.lang.String) {
                            dlt.a.a(i, (java.lang.String) b2);
                        } else {
                            dlt.a.a(i, (defpackage.dha) b2);
                        }
                        i2 = i3 + 1;
                    } else {
                        return;
                    }
                }
            } else {
                while (i2 < list.size()) {
                    dlt.a.a(i, (java.lang.String) list.get(i2));
                    i2++;
                }
            }
        }
    }

    public static void b(int i, java.util.List list, defpackage.dlt dlt) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 < list.size()) {
                    dlt.a.a(i, (defpackage.dha) list.get(i3));
                    i2 = i3 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public static void a(int i, java.util.List list, defpackage.dlt dlt, defpackage.dkh dkh) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                dlt.a(i, list.get(i2), dkh);
            }
        }
    }

    public static void b(int i, java.util.List list, defpackage.dlt dlt, defpackage.dkh dkh) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                dlt.b(i, list.get(i2), dkh);
            }
        }
    }

    static int a(java.util.List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof defpackage.djd) {
            defpackage.djd djd = (defpackage.djd) list;
            int i2 = 0;
            while (i2 < size) {
                int d2 = defpackage.dhn.d(djd.b(i2)) + i;
                i2++;
                i = d2;
            }
            return i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += defpackage.dhn.d(((java.lang.Long) list.get(i4)).longValue());
        }
        return i3;
    }

    static int a(int i, java.util.List list) {
        if (list.size() == 0) {
            return 0;
        }
        return a(list) + (list.size() * defpackage.dhn.m(i));
    }

    static int b(java.util.List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof defpackage.djd) {
            defpackage.djd djd = (defpackage.djd) list;
            int i2 = 0;
            while (i2 < size) {
                int e = defpackage.dhn.e(djd.b(i2)) + i;
                i2++;
                i = e;
            }
            return i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += defpackage.dhn.e(((java.lang.Long) list.get(i4)).longValue());
        }
        return i3;
    }

    static int b(int i, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * defpackage.dhn.m(i)) + b(list);
    }

    static int c(java.util.List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof defpackage.djd) {
            defpackage.djd djd = (defpackage.djd) list;
            int i2 = 0;
            while (i2 < size) {
                int f = defpackage.dhn.f(djd.b(i2)) + i;
                i2++;
                i = f;
            }
            return i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += defpackage.dhn.f(((java.lang.Long) list.get(i4)).longValue());
        }
        return i3;
    }

    static int c(int i, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * defpackage.dhn.m(i)) + c(list);
    }

    static int d(java.util.List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof defpackage.dil) {
            defpackage.dil dil = (defpackage.dil) list;
            int i2 = 0;
            while (i2 < size) {
                int q = defpackage.dhn.q(dil.c(i2)) + i;
                i2++;
                i = q;
            }
            return i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += defpackage.dhn.q(((java.lang.Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    static int d(int i, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * defpackage.dhn.m(i)) + d(list);
    }

    static int e(java.util.List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof defpackage.dil) {
            defpackage.dil dil = (defpackage.dil) list;
            int i2 = 0;
            while (i2 < size) {
                int n = defpackage.dhn.n(dil.c(i2)) + i;
                i2++;
                i = n;
            }
            return i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += defpackage.dhn.n(((java.lang.Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    static int e(int i, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * defpackage.dhn.m(i)) + e(list);
    }

    static int f(java.util.List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof defpackage.dil) {
            defpackage.dil dil = (defpackage.dil) list;
            int i2 = 0;
            while (i2 < size) {
                int o = defpackage.dhn.o(dil.c(i2)) + i;
                i2++;
                i = o;
            }
            return i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += defpackage.dhn.o(((java.lang.Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    static int f(int i, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * defpackage.dhn.m(i)) + f(list);
    }

    static int g(java.util.List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof defpackage.dil) {
            defpackage.dil dil = (defpackage.dil) list;
            int i2 = 0;
            while (i2 < size) {
                int p = defpackage.dhn.p(dil.c(i2)) + i;
                i2++;
                i = p;
            }
            return i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += defpackage.dhn.p(((java.lang.Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    static int g(int i, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * defpackage.dhn.m(i)) + g(list);
    }

    static int h(java.util.List list) {
        return list.size() << 2;
    }

    static int h(int i, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * defpackage.dhn.f(i);
    }

    static int i(java.util.List list) {
        return list.size() << 3;
    }

    static int i(int i, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * defpackage.dhn.h(i);
    }

    static int j(java.util.List list) {
        return list.size();
    }

    static int j(int i, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * defpackage.dhn.l(i);
    }

    static int k(int i, java.util.List list) {
        int b2;
        int b3;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m = defpackage.dhn.m(i) * size;
        if (list instanceof defpackage.diz) {
            defpackage.diz diz = (defpackage.diz) list;
            int i2 = 0;
            while (i2 < size) {
                java.lang.Object b4 = diz.b(i2);
                if (b4 instanceof defpackage.dha) {
                    b3 = defpackage.dhn.b((defpackage.dha) b4);
                } else {
                    b3 = defpackage.dhn.b((java.lang.String) b4);
                }
                i2++;
                m = b3 + m;
            }
            return m;
        }
        int i3 = 0;
        while (i3 < size) {
            java.lang.Object obj = list.get(i3);
            if (obj instanceof defpackage.dha) {
                b2 = defpackage.dhn.b((defpackage.dha) obj);
            } else {
                b2 = defpackage.dhn.b((java.lang.String) obj);
            }
            i3++;
            m = b2 + m;
        }
        return m;
    }

    static int a(int i, java.lang.Object obj, defpackage.dkh dkh) {
        if (obj instanceof defpackage.dix) {
            return defpackage.dhn.a(i, (defpackage.dix) obj);
        }
        return defpackage.dhn.b(i, (defpackage.djo) obj, dkh);
    }

    static int a(int i, java.util.List list, defpackage.dkh dkh) {
        int b2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m = defpackage.dhn.m(i) * size;
        int i2 = 0;
        while (i2 < size) {
            java.lang.Object obj = list.get(i2);
            if (obj instanceof defpackage.dix) {
                b2 = defpackage.dhn.a((defpackage.dix) obj);
            } else {
                b2 = defpackage.dhn.b((defpackage.djo) obj, dkh);
            }
            i2++;
            m = b2 + m;
        }
        return m;
    }

    static int l(int i, java.util.List list) {
        int i2 = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m = size * defpackage.dhn.m(i);
        while (true) {
            int i3 = i2;
            if (i3 >= list.size()) {
                return m;
            }
            m += defpackage.dhn.b((defpackage.dha) list.get(i3));
            i2 = i3 + 1;
        }
    }

    static int b(int i, java.util.List list, defpackage.dkh dkh) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += defpackage.dhn.c(i, (defpackage.djo) list.get(i3), dkh);
        }
        return i2;
    }

    private static defpackage.dkx a(boolean z) {
        try {
            java.lang.Class b2 = b();
            if (b2 == null) {
                return null;
            }
            return (defpackage.dkx) b2.getConstructor(new java.lang.Class[]{java.lang.Boolean.TYPE}).newInstance(new java.lang.Object[]{java.lang.Boolean.valueOf(z)});
        } catch (Throwable th) {
            return null;
        }
    }

    private static java.lang.Class a() {
        try {
            return java.lang.Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable th) {
            return null;
        }
    }

    private static java.lang.Class b() {
        try {
            return java.lang.Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable th) {
            return null;
        }
    }

    static boolean a(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static void a(java.lang.Object obj, java.lang.Object obj2, long j) {
        defpackage.dlc.a(obj, j, defpackage.djk.a(defpackage.dlc.f(obj, j), defpackage.dlc.f(obj2, j)));
    }

    static void a(defpackage.dhy dhy, java.lang.Object obj, java.lang.Object obj2) {
        defpackage.dia dia = ((defpackage.dij) obj2).a;
        if (!dia.a.isEmpty()) {
            defpackage.dia a2 = defpackage.dhy.a(obj);
            for (int i = 0; i < dia.a.b(); i++) {
                a2.a(dia.a.b(i));
            }
            for (java.util.Map.Entry a3 : dia.a.c()) {
                a2.a(a3);
            }
        }
    }

    static void a(defpackage.dkx dkx, java.lang.Object obj, java.lang.Object obj2) {
        defpackage.dky dky = ((defpackage.dih) obj).s;
        defpackage.dky dky2 = ((defpackage.dih) obj2).s;
        if (!dky2.equals(defpackage.dky.a)) {
            dky = defpackage.dky.a(dky, dky2);
        }
        defpackage.dkx.a(obj, dky);
    }

    static java.lang.Object a(int i, java.util.List list, defpackage.dio dio, java.lang.Object obj, defpackage.dkx dkx) {
        java.lang.Object obj2;
        java.lang.Object a2;
        int i2;
        if (dio == null) {
            return obj;
        }
        if (list instanceof java.util.RandomAccess) {
            int size = list.size();
            int i3 = 0;
            int i4 = 0;
            obj2 = obj;
            while (i3 < size) {
                int intValue = ((java.lang.Integer) list.get(i3)).intValue();
                if (dio.a(intValue) != null) {
                    if (i3 != i4) {
                        list.set(i4, java.lang.Integer.valueOf(intValue));
                    }
                    i2 = i4 + 1;
                    a2 = obj2;
                } else {
                    int i5 = i4;
                    a2 = a(i, intValue, obj2, dkx);
                    i2 = i5;
                }
                i3++;
                obj2 = a2;
                i4 = i2;
            }
            if (i4 != size) {
                list.subList(i4, size).clear();
            }
        } else {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((java.lang.Integer) it.next()).intValue();
                if (dio.a(intValue2) == null) {
                    obj = a(i, intValue2, obj, dkx);
                    it.remove();
                }
            }
            obj2 = obj;
        }
        return obj2;
    }

    static java.lang.Object a(int i, int i2, java.lang.Object obj, defpackage.dkx dkx) {
        if (obj == null) {
            obj = new defpackage.dky();
        }
        ((defpackage.dky) obj).a(i << 3, (java.lang.Object) java.lang.Long.valueOf((long) i2));
        return obj;
    }
}
