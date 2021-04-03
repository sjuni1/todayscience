package org.pdc.TodayScience;

import org.junit.jupiter.api.Test;
import org.pdc.TodayScience.Database.MariaDBConnect;

public class test {
    MariaDBConnect connect = new MariaDBConnect();
    @Test
    void run() {
        String a = connect.Run();
        return;
    }
}
