package ru.chaban.exercise_4.utility;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import ru.chaban.exercise_4.data.GetRaws;
import ru.chaban.exercise_4.data.RawInFile;
import ru.chaban.exercise_4.domain.Logins;
import ru.chaban.exercise_4.domain.Users;
import ru.chaban.exercise_4.save_data.LoginsServiceInteface;
import ru.chaban.exercise_4.save_data.UsersServiceInterface;

import java.util.List;

@Component
@AllArgsConstructor
public class FromFileToDB {

    private final GetRaws getRaws;
    private final ConvertRawToUsersInteface convertRawToUsers;
    private final ConvertRawToLoginsInteface convertRawToLogins;
    private final UsersServiceInterface usersServiceInterface;
    private final LoginsServiceInteface loginsServiceInterface;

    public void doIt(){

        // Шаг 1 чтение
        List<RawInFile> rawInFiles = getRaws.get();
        System.out.println(rawInFiles);

        //шаг 2 преобразование
        List<Users> users = convertRawToUsers.getUsers(rawInFiles);
        System.out.println(users);

        //шаг 3 сохранить в базу
        usersServiceInterface.save(users);
        System.out.println("сохранили пользователей");

        // преобразование
        List<Logins> logins = convertRawToLogins.getLogins(rawInFiles);
        System.out.println(logins);

        // сохранить
        loginsServiceInterface.save(logins);
        System.out.println("Сохранили логины");
    }
}
