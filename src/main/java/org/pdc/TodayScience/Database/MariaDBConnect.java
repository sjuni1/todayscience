package org.pdc.TodayScience.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MariaDBConnect {
    public static Connection db;
    private PreparedStatement pstmt = null;

    private MariaDBConnect() {
    }
}
