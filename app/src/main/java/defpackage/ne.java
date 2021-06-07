package defpackage;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ne  reason: default package */
/* compiled from: PG */
public final class ne {
    public final Notification.Builder a;
    public final ni b;
    public final List c = new ArrayList();
    public final Bundle d = new Bundle();
    public int e;

    ne(ni niVar) {
        Bundle bundle;
        Bundle bundle2;
        this.b = niVar;
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new Notification.Builder(niVar.a, niVar.s);
        } else {
            this.a = new Notification.Builder(niVar.a);
        }
        Notification notification = niVar.u;
        this.a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(niVar.d).setContentText(niVar.e).setContentInfo(null).setContentIntent(niVar.f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setLargeIcon(niVar.g).setNumber(0).setProgress(0, 0, false);
        if (Build.VERSION.SDK_INT < 21) {
            this.a.setSound(notification.sound, notification.audioStreamType);
        }
        this.a.setSubText(niVar.j).setUsesChronometer(false).setPriority(niVar.h);
        ArrayList arrayList = niVar.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            nf nfVar = (nf) arrayList.get(i);
            if (Build.VERSION.SDK_INT >= 20) {
                Notification.Action.Builder builder = new Notification.Action.Builder(nfVar.d, nfVar.e, nfVar.f);
                if (nfVar.a != null) {
                    bundle2 = new Bundle(nfVar.a);
                } else {
                    bundle2 = new Bundle();
                }
                bundle2.putBoolean("android.support.allowGeneratedReplies", nfVar.b);
                if (Build.VERSION.SDK_INT >= 24) {
                    builder.setAllowGeneratedReplies(nfVar.b);
                }
                bundle2.putInt("android.support.action.semanticAction", 0);
                if (Build.VERSION.SDK_INT >= 28) {
                    builder.setSemanticAction(0);
                }
                bundle2.putBoolean("android.support.action.showsUserInterface", nfVar.c);
                builder.addExtras(bundle2);
                this.a.addAction(builder.build());
                i = i2;
            } else {
                this.c.add(nl.a(this.a, nfVar));
                i = i2;
            }
        }
        if (niVar.o != null) {
            this.d.putAll(niVar.o);
        }
        if (Build.VERSION.SDK_INT < 20) {
            if (niVar.m) {
                this.d.putBoolean("android.support.localOnly", true);
            }
            if (niVar.k != null) {
                this.d.putString("android.support.groupKey", niVar.k);
                if (niVar.l) {
                    this.d.putBoolean("android.support.isGroupSummary", true);
                } else {
                    this.d.putBoolean("android.support.useSideChannel", true);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.setShowWhen(niVar.i);
            if (Build.VERSION.SDK_INT < 21 && niVar.v != null && !niVar.v.isEmpty()) {
                this.d.putStringArray("android.people", (String[]) niVar.v.toArray(new String[niVar.v.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.a.setLocalOnly(niVar.m).setGroup(niVar.k).setGroupSummary(niVar.l).setSortKey(null);
            this.e = niVar.t;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.a.setCategory(niVar.n).setColor(niVar.p).setVisibility(niVar.q).setPublicVersion(niVar.r).setSound(notification.sound, notification.audioAttributes);
            ArrayList arrayList2 = niVar.v;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj = arrayList2.get(i3);
                i3++;
                this.a.addPerson((String) obj);
            }
            Bundle bundle3 = niVar.a().getBundle("android.car.EXTENSIONS");
            if (bundle3 == null) {
                bundle = new Bundle();
            } else {
                bundle = bundle3;
            }
            Bundle bundle4 = new Bundle();
            for (int i4 = 0; i4 < niVar.c.size(); i4++) {
                bundle4.putBundle(Integer.toString(i4), nl.a((nf) niVar.c.get(i4)));
            }
            bundle.putBundle("invisible_actions", bundle4);
            niVar.a().putBundle("android.car.EXTENSIONS", bundle);
            this.d.putBundle("android.car.EXTENSIONS", bundle);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.a.setExtras(niVar.o).setRemoteInputHistory(null);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.a.setBadgeIconType(0).setShortcutId(null).setTimeoutAfter(0).setGroupAlertBehavior(niVar.t);
            if (!TextUtils.isEmpty(niVar.s)) {
                this.a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
    }

    static void a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
