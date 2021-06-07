package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: dvj  reason: default package */
/* compiled from: PG */
final class dvj implements dov {
    dvj() {
    }

    @Override // defpackage.dov
    public final /* synthetic */ Object a(String str) {
        boolean z;
        cld.a(str.length() > 0, "empty timeout");
        if (str.length() <= 9) {
            z = true;
        } else {
            z = false;
        }
        cld.a(z, "bad timeout format");
        long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
        char charAt = str.charAt(str.length() - 1);
        switch (charAt) {
            case 'H':
                return Long.valueOf(TimeUnit.HOURS.toNanos(parseLong));
            case 'M':
                return Long.valueOf(TimeUnit.MINUTES.toNanos(parseLong));
            case 'S':
                return Long.valueOf(TimeUnit.SECONDS.toNanos(parseLong));
            case 'm':
                return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(parseLong));
            case 'n':
                return Long.valueOf(parseLong);
            case 'u':
                return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(parseLong));
            default:
                throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(charAt)));
        }
    }

    @Override // defpackage.dov
    public final /* synthetic */ String a(Object obj) {
        Long l = (Long) obj;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (l.longValue() < 0) {
            throw new IllegalArgumentException("Timeout too small");
        } else if (l.longValue() < 100000000) {
            String valueOf = String.valueOf(l);
            return new StringBuilder(String.valueOf(valueOf).length() + 1).append(valueOf).append("n").toString();
        } else if (l.longValue() < 100000000000L) {
            return new StringBuilder(21).append(timeUnit.toMicros(l.longValue())).append("u").toString();
        } else if (l.longValue() < 100000000000000L) {
            return new StringBuilder(21).append(timeUnit.toMillis(l.longValue())).append("m").toString();
        } else if (l.longValue() < 100000000000000000L) {
            return new StringBuilder(21).append(timeUnit.toSeconds(l.longValue())).append("S").toString();
        } else if (l.longValue() < 6000000000000000000L) {
            return new StringBuilder(21).append(timeUnit.toMinutes(l.longValue())).append("M").toString();
        } else {
            return new StringBuilder(21).append(timeUnit.toHours(l.longValue())).append("H").toString();
        }
    }
}
