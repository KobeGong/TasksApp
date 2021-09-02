package defpackage;

/* renamed from: dvj reason: default package */
/* compiled from: PG */
final class dvj implements defpackage.dov {
    dvj() {
    }

    public final /* synthetic */ java.lang.Object a(java.lang.String str) {
        boolean z;
        defpackage.cld.a(str.length() > 0, (java.lang.Object) "empty timeout");
        if (str.length() <= 9) {
            z = true;
        } else {
            z = false;
        }
        defpackage.cld.a(z, (java.lang.Object) "bad timeout format");
        long parseLong = java.lang.Long.parseLong(str.substring(0, str.length() - 1));
        char charAt = str.charAt(str.length() - 1);
        switch (charAt) {
            case 'H':
                return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.HOURS.toNanos(parseLong));
            case 'M':
                return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MINUTES.toNanos(parseLong));
            case 'S':
                return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.SECONDS.toNanos(parseLong));
            case 'm':
                return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(parseLong));
            case 'n':
                return java.lang.Long.valueOf(parseLong);
            case 'u':
                return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MICROSECONDS.toNanos(parseLong));
            default:
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Invalid timeout unit: %s", new java.lang.Object[]{java.lang.Character.valueOf(charAt)}));
        }
    }

    public final /* synthetic */ java.lang.String a(java.lang.Object obj) {
        java.lang.Long l = (java.lang.Long) obj;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
        if (l.longValue() < 0) {
            throw new java.lang.IllegalArgumentException("Timeout too small");
        } else if (l.longValue() < 100000000) {
            java.lang.String valueOf = java.lang.String.valueOf(l);
            return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 1).append(valueOf).append("n").toString();
        } else if (l.longValue() < 100000000000L) {
            return timeUnit.toMicros(l.longValue()) + "u";
        } else if (l.longValue() < 100000000000000L) {
            return timeUnit.toMillis(l.longValue()) + "m";
        } else if (l.longValue() < 100000000000000000L) {
            return timeUnit.toSeconds(l.longValue()) + "S";
        } else if (l.longValue() < 6000000000000000000L) {
            return timeUnit.toMinutes(l.longValue()) + "M";
        } else {
            return timeUnit.toHours(l.longValue()) + "H";
        }
    }
}
