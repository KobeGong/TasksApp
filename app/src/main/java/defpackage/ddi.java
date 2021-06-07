package defpackage;

/* renamed from: ddi  reason: default package */
/* compiled from: PG */
public enum ddi implements din {
    NOTIFICATION_FAILURE_UNSPECIFIED(0),
    BAD_CHANNEL(1),
    USER_BLOCKED(6),
    BAD_PAYLOAD(2),
    INSUFFICIENT_DATA_NO_TITLE(7),
    INSUFFICIENT_DATA_NO_TEXT(8),
    DROPPED_BY_CLIENT(3),
    INVALID_USER(4),
    RECIPIENT_NOT_FOUND(9),
    RECIPIENT_NOT_REGISTERED(10),
    SDK_DOES_NOT_SUPPORT(5),
    FAILED_TO_DOWNLOAD_IMAGE(11),
    FAILED_TO_FETCH_LATEST_NOTIFICATIONS(12),
    FAILED_TO_FETCH_UPDATED_NOTIFICATIONS(13),
    FAILED_TO_REGISTER(14),
    FAILED_TO_UNREGISTER(15),
    FAILED_TO_UPDATE_THREAD_STATE(16),
    FAILED_TO_UPDATE_THREAD_STATE_BY_TOKEN(17),
    FAILED_TO_SUBSCRIBE_TO_TOPICS(18),
    FAILED_TO_UNSUBSCRIBE_FROM_TOPICS(19),
    FAILED_TO_FETCH_PREFS(20),
    FAILED_TO_UPDATE_PREFS(21),
    FAILED_TO_ACKNOWLEDGE(22);
    
    public static final dio i = new ddj();
    public final int j;

    @Override // defpackage.din
    public final int a() {
        return this.j;
    }

    public static ddi a(int i2) {
        switch (i2) {
            case 0:
                return NOTIFICATION_FAILURE_UNSPECIFIED;
            case 1:
                return BAD_CHANNEL;
            case 2:
                return BAD_PAYLOAD;
            case 3:
                return DROPPED_BY_CLIENT;
            case 4:
                return INVALID_USER;
            case 5:
                return SDK_DOES_NOT_SUPPORT;
            case 6:
                return USER_BLOCKED;
            case 7:
                return INSUFFICIENT_DATA_NO_TITLE;
            case 8:
                return INSUFFICIENT_DATA_NO_TEXT;
            case 9:
                return RECIPIENT_NOT_FOUND;
            case 10:
                return RECIPIENT_NOT_REGISTERED;
            case 11:
                return FAILED_TO_DOWNLOAD_IMAGE;
            case 12:
                return FAILED_TO_FETCH_LATEST_NOTIFICATIONS;
            case 13:
                return FAILED_TO_FETCH_UPDATED_NOTIFICATIONS;
            case 14:
                return FAILED_TO_REGISTER;
            case 15:
                return FAILED_TO_UNREGISTER;
            case 16:
                return FAILED_TO_UPDATE_THREAD_STATE;
            case 17:
                return FAILED_TO_UPDATE_THREAD_STATE_BY_TOKEN;
            case 18:
                return FAILED_TO_SUBSCRIBE_TO_TOPICS;
            case 19:
                return FAILED_TO_UNSUBSCRIBE_FROM_TOPICS;
            case 20:
                return FAILED_TO_FETCH_PREFS;
            case 21:
                return FAILED_TO_UPDATE_PREFS;
            case 22:
                return FAILED_TO_ACKNOWLEDGE;
            default:
                return null;
        }
    }

    private ddi(int i2) {
        this.j = i2;
    }
}
