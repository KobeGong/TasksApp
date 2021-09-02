package defpackage;

/* renamed from: ne reason: default package */
/* compiled from: PG */
public final class ne {
    public final android.app.Notification.Builder a;
    public final defpackage.ni b;
    public final java.util.List c = new java.util.ArrayList();
    public final android.os.Bundle d = new android.os.Bundle();
    public int e;

    ne(defpackage.ni niVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        android.os.Bundle bundle;
        android.os.Bundle bundle2;
        this.b = niVar;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.a = new android.app.Notification.Builder(niVar.a, niVar.s);
        } else {
            this.a = new android.app.Notification.Builder(niVar.a);
        }
        android.app.Notification notification = niVar.u;
        android.app.Notification.Builder lights = this.a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        android.app.Notification.Builder ongoing = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        android.app.Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z2);
        if ((notification.flags & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        android.app.Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z3).setDefaults(notification.defaults).setContentTitle(niVar.d).setContentText(niVar.e).setContentInfo(null).setContentIntent(niVar.f).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 128) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        deleteIntent.setFullScreenIntent(null, z4).setLargeIcon(niVar.g).setNumber(0).setProgress(0, 0, false);
        if (android.os.Build.VERSION.SDK_INT < 21) {
            this.a.setSound(notification.sound, notification.audioStreamType);
        }
        this.a.setSubText(niVar.j).setUsesChronometer(false).setPriority(niVar.h);
        java.util.ArrayList arrayList = niVar.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            defpackage.nf nfVar = (defpackage.nf) arrayList.get(i);
            if (android.os.Build.VERSION.SDK_INT >= 20) {
                android.app.Notification.Action.Builder builder = new android.app.Notification.Action.Builder(nfVar.d, nfVar.e, nfVar.f);
                if (nfVar.a != null) {
                    bundle2 = new android.os.Bundle(nfVar.a);
                } else {
                    bundle2 = new android.os.Bundle();
                }
                bundle2.putBoolean("android.support.allowGeneratedReplies", nfVar.b);
                if (android.os.Build.VERSION.SDK_INT >= 24) {
                    builder.setAllowGeneratedReplies(nfVar.b);
                }
                bundle2.putInt("android.support.action.semanticAction", 0);
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    builder.setSemanticAction(0);
                }
                bundle2.putBoolean("android.support.action.showsUserInterface", nfVar.c);
                builder.addExtras(bundle2);
                this.a.addAction(builder.build());
                i = i2;
            } else {
                this.c.add(defpackage.nl.a(this.a, nfVar));
                i = i2;
            }
        }
        if (niVar.o != null) {
            this.d.putAll(niVar.o);
        }
        if (android.os.Build.VERSION.SDK_INT < 20) {
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
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            this.a.setShowWhen(niVar.i);
            if (android.os.Build.VERSION.SDK_INT < 21 && niVar.v != null && !niVar.v.isEmpty()) {
                this.d.putStringArray("android.people", (java.lang.String[]) niVar.v.toArray(new java.lang.String[niVar.v.size()]));
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            this.a.setLocalOnly(niVar.m).setGroup(niVar.k).setGroupSummary(niVar.l).setSortKey(null);
            this.e = niVar.t;
        }
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            this.a.setCategory(niVar.n).setColor(niVar.p).setVisibility(niVar.q).setPublicVersion(niVar.r).setSound(notification.sound, notification.audioAttributes);
            java.util.ArrayList arrayList2 = niVar.v;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                java.lang.Object obj = arrayList2.get(i3);
                i3++;
                this.a.addPerson((java.lang.String) obj);
            }
            android.os.Bundle bundle3 = niVar.a().getBundle("android.car.EXTENSIONS");
            if (bundle3 == null) {
                bundle = new android.os.Bundle();
            } else {
                bundle = bundle3;
            }
            android.os.Bundle bundle4 = new android.os.Bundle();
            for (int i4 = 0; i4 < niVar.c.size(); i4++) {
                bundle4.putBundle(java.lang.Integer.toString(i4), defpackage.nl.a((defpackage.nf) niVar.c.get(i4)));
            }
            bundle.putBundle("invisible_actions", bundle4);
            niVar.a().putBundle("android.car.EXTENSIONS", bundle);
            this.d.putBundle("android.car.EXTENSIONS", bundle);
        }
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            this.a.setExtras(niVar.o).setRemoteInputHistory(null);
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.a.setBadgeIconType(0).setShortcutId(null).setTimeoutAfter(0).setGroupAlertBehavior(niVar.t);
            if (!android.text.TextUtils.isEmpty(niVar.s)) {
                this.a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
    }

    static void a(android.app.Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
