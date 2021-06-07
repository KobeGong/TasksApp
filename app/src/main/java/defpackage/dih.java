package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: dih  reason: default package */
/* compiled from: PG */
public abstract class dih extends dgo {
    public static Map t = new ConcurrentHashMap();
    private int a = -1;
    public dky s = dky.a;

    public abstract Object a(int i);

    @Override // defpackage.djo
    public final djx d() {
        return (djx) a(bg.aq);
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ").append(obj);
        dgv.a(this, sb, 0);
        return sb.toString();
    }

    public int hashCode() {
        if (this.r != 0) {
            return this.r;
        }
        this.r = djz.a.a(this).a(this);
        return this.r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((dih) a(bg.ap)).getClass().isInstance(obj)) {
            return false;
        }
        return djz.a.a(this).a(this, (dih) obj);
    }

    @Override // defpackage.djq
    public final boolean e() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) a(bg.ak)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = djz.a.a(this).d(this);
        if (!booleanValue) {
            return d;
        }
        a(bg.al);
        return d;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dgo
    public final int c() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dgo
    public final void b(int i) {
        this.a = i;
    }

    @Override // defpackage.djo
    public final void a(dhn dhn) {
        dlt dlt;
        dkh a2 = djz.a.a((Class) getClass());
        if (dhn.b != null) {
            dlt = dhn.b;
        } else {
            dlt = new dlt(dhn);
        }
        a2.a((Object) this, dlt);
    }

    @Override // defpackage.djo
    public final int f() {
        if (this.a == -1) {
            this.a = djz.a.a(this).b(this);
        }
        return this.a;
    }

    static dih a(Class cls) {
        dih dih = (dih) t.get(cls);
        if (dih == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                dih = (dih) t.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (dih != null) {
            return dih;
        }
        String valueOf = String.valueOf(cls.getName());
        throw new IllegalStateException(valueOf.length() != 0 ? "Unable to get default instance for: ".concat(valueOf) : new String("Unable to get default instance for: "));
    }

    static Object a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static final boolean a(dih dih, boolean z) {
        byte byteValue = ((Byte) dih.a(bg.ak)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = djz.a.a(dih).d(dih);
        if (!z) {
            return d;
        }
        dih.a(bg.al);
        return d;
    }

    static dih a(dih dih, dhj dhj, dhw dhw) {
        dih dih2 = (dih) dih.a(bg.an);
        try {
            djz.a.a(dih2).a(dih2, dhm.a(dhj), dhw);
            djz.a.a(dih2).c(dih2);
            return dih2;
        } catch (IOException e) {
            if (e.getCause() instanceof dir) {
                throw ((dir) e.getCause());
            }
            throw new dir(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof dir) {
                throw ((dir) e2.getCause());
            }
            throw e2;
        }
    }

    private static dih b(dih dih, byte[] bArr) {
        dih dih2 = (dih) dih.a(bg.an);
        try {
            djz.a.a(dih2).a(dih2, bArr, 0, bArr.length, new dgw());
            djz.a.a(dih2).c(dih2);
            if (dih2.r == 0) {
                return dih2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof dir) {
                throw ((dir) e.getCause());
            }
            throw new dir(e.getMessage());
        } catch (IndexOutOfBoundsException e2) {
            dir a2 = dir.a();
            if (a2 == null) {
                throw null;
            }
            throw a2;
        }
    }

    public static dih a(dih dih, dha dha) {
        boolean d;
        boolean d2;
        dih a2 = a(dih, dha, dhw.a());
        if (a2 != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) a2.a(bg.ak)).byteValue();
            if (byteValue == 1) {
                d2 = true;
            } else if (byteValue == 0) {
                d2 = false;
            } else {
                d2 = djz.a.a(a2).d(a2);
                if (booleanValue) {
                    a2.a(bg.al);
                }
            }
            if (!d2) {
                dir a3 = new dkw().a();
                if (a3 == null) {
                    throw null;
                }
                throw a3;
            }
        }
        if (a2 != null) {
            boolean booleanValue2 = Boolean.TRUE.booleanValue();
            byte byteValue2 = ((Byte) a2.a(bg.ak)).byteValue();
            if (byteValue2 == 1) {
                d = true;
            } else if (byteValue2 == 0) {
                d = false;
            } else {
                d = djz.a.a(a2).d(a2);
                if (booleanValue2) {
                    a2.a(bg.al);
                }
            }
            if (!d) {
                dir a4 = new dkw().a();
                if (a4 == null) {
                    throw null;
                }
                throw a4;
            }
        }
        return a2;
    }

    private static dih a(dih dih, dha dha, dhw dhw) {
        try {
            dhj e = dha.e();
            dih a2 = a(dih, e, dhw);
            try {
                e.a(0);
                return a2;
            } catch (dir e2) {
                throw e2;
            }
        } catch (dir e3) {
            throw e3;
        }
    }

    public static dih a(dih dih, byte[] bArr) {
        boolean d;
        dih b = b(dih, bArr);
        if (b != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) b.a(bg.ak)).byteValue();
            if (byteValue == 1) {
                d = true;
            } else if (byteValue == 0) {
                d = false;
            } else {
                d = djz.a.a(b).d(b);
                if (booleanValue) {
                    b.a(bg.al);
                }
            }
            if (!d) {
                dir a2 = new dkw().a();
                if (a2 == null) {
                    throw null;
                }
                throw a2;
            }
        }
        return b;
    }

    @Override // defpackage.djo
    public final /* synthetic */ djp g() {
        dii dii = (dii) a(bg.ao);
        dii.a(this);
        return dii;
    }

    @Override // defpackage.djo
    public final /* synthetic */ djp h() {
        return (dii) a(bg.ao);
    }

    @Override // defpackage.djq
    public final /* synthetic */ djo i() {
        return (dih) a(bg.ap);
    }
}
