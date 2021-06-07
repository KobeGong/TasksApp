package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: ni  reason: default package */
/* compiled from: PG */
public final class ni {
    public Context a;
    public ArrayList b;
    public ArrayList c;
    public CharSequence d;
    public CharSequence e;
    public PendingIntent f;
    public Bitmap g;
    public int h;
    public boolean i;
    public CharSequence j;
    public String k;
    public boolean l;
    public boolean m;
    public String n;
    public Bundle o;
    public int p;
    public int q;
    public Notification r;
    public String s;
    public int t;
    public Notification u;
    @Deprecated
    public ArrayList v;
    private nk w;

    private ni(Context context) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.i = true;
        this.m = false;
        this.p = 0;
        this.q = 0;
        this.t = 0;
        this.u = new Notification();
        this.a = context;
        this.s = null;
        this.u.when = System.currentTimeMillis();
        this.u.audioStreamType = -1;
        this.h = 0;
        this.v = new ArrayList();
    }

    @Deprecated
    public ni(Context context, byte b2) {
        this(context);
    }

    public final ni a(long j2) {
        this.u.when = j2;
        return this;
    }

    public final ni a(int i2) {
        this.u.icon = i2;
        return this;
    }

    public final ni a(CharSequence charSequence) {
        this.d = e(charSequence);
        return this;
    }

    public final ni b(CharSequence charSequence) {
        this.e = e(charSequence);
        return this;
    }

    public final ni c(CharSequence charSequence) {
        this.j = e(charSequence);
        return this;
    }

    public final ni a(PendingIntent pendingIntent) {
        this.u.deleteIntent = pendingIntent;
        return this;
    }

    public final ni d(CharSequence charSequence) {
        this.u.tickerText = e(charSequence);
        return this;
    }

    public final ni a(Uri uri) {
        this.u.sound = uri;
        this.u.audioStreamType = -1;
        if (Build.VERSION.SDK_INT >= 21) {
            this.u.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
        }
        return this;
    }

    public final void b(int i2) {
        this.u.flags |= i2;
    }

    public final Bundle a() {
        if (this.o == null) {
            this.o = new Bundle();
        }
        return this.o;
    }

    public final ni a(nk nkVar) {
        if (this.w != nkVar) {
            this.w = nkVar;
            if (this.w != null) {
                this.w.a(this);
            }
        }
        return this;
    }

    public final Notification b() {
        Notification notification;
        ne neVar = new ne(this);
        nk nkVar = neVar.b.w;
        if (nkVar != null) {
            nkVar.a(neVar);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            notification = neVar.a.build();
        } else if (Build.VERSION.SDK_INT >= 24) {
            notification = neVar.a.build();
            if (neVar.e != 0) {
                if (!(notification.getGroup() == null || (notification.flags & 512) == 0 || neVar.e != 2)) {
                    ne.a(notification);
                }
                if (notification.getGroup() != null && (notification.flags & 512) == 0 && neVar.e == 1) {
                    ne.a(notification);
                }
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            neVar.a.setExtras(neVar.d);
            notification = neVar.a.build();
            if (neVar.e != 0) {
                if (!(notification.getGroup() == null || (notification.flags & 512) == 0 || neVar.e != 2)) {
                    ne.a(notification);
                }
                if (notification.getGroup() != null && (notification.flags & 512) == 0 && neVar.e == 1) {
                    ne.a(notification);
                }
            }
        } else if (Build.VERSION.SDK_INT >= 20) {
            neVar.a.setExtras(neVar.d);
            notification = neVar.a.build();
            if (neVar.e != 0) {
                if (!(notification.getGroup() == null || (notification.flags & 512) == 0 || neVar.e != 2)) {
                    ne.a(notification);
                }
                if (notification.getGroup() != null && (notification.flags & 512) == 0 && neVar.e == 1) {
                    ne.a(notification);
                }
            }
        } else if (Build.VERSION.SDK_INT >= 19) {
            SparseArray<? extends Parcelable> a2 = nl.a(neVar.c);
            if (a2 != null) {
                neVar.d.putSparseParcelableArray("android.support.actionExtras", a2);
            }
            neVar.a.setExtras(neVar.d);
            notification = neVar.a.build();
        } else {
            Notification build = neVar.a.build();
            Bundle a3 = jd.a(build);
            Bundle bundle = new Bundle(neVar.d);
            for (String str : neVar.d.keySet()) {
                if (a3.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a3.putAll(bundle);
            SparseArray<? extends Parcelable> a4 = nl.a(neVar.c);
            if (a4 != null) {
                jd.a(build).putSparseParcelableArray("android.support.actionExtras", a4);
            }
            notification = build;
        }
        if (nkVar != null) {
            jd.a(notification);
        }
        return notification;
    }

    public static CharSequence e(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }
}
