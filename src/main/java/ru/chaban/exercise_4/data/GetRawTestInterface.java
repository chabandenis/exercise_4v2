package ru.chaban.exercise_4.data;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@Data
public class GetRawTestInterface implements GetRawsInterface {
    @Override
    public List<RawInFile> get() {
        List<RawInFile> rawInFiles = new ArrayList<>();

        RawInFile logins1 = new RawInFile();
        logins1.setId(1);
        logins1.setApplication("Application1");
        logins1.setAccess_date(LocalDate.now());
        logins1.setUsername("username1");
        logins1.setId_user(1);
        logins1.setFio("fio1");
        logins1.setId_user(1);
        logins1.setUserId(1);
        rawInFiles.add(logins1);

        RawInFile logins2 = new RawInFile();
        logins2.setId(2);
        logins2.setApplication("Application2");
        logins2.setAccess_date(LocalDate.now());
        logins2.setUsername("username2");
        logins2.setId_user(2);
        logins2.setFio("fio2");
        logins2.setId_user(2);
        logins2.setUserId(2);
        rawInFiles.add(logins2);

        RawInFile logins3 = new RawInFile();
        logins3.setId(3);
        logins3.setApplication("Application2");
        logins3.setAccess_date(null);
        logins3.setUsername("username2");
        logins3.setId_user(3);
        logins3.setFio("fio2");
        logins3.setId_user(3);
        logins3.setUserId(3);
        rawInFiles.add(logins3);

        return rawInFiles;
    }
}
