package ru.chaban.exercise_4.utility;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import ru.chaban.exercise_4.data.RawInFile;
import ru.chaban.exercise_4.domain.Logins;
import ru.chaban.exercise_4.repository.UsersRepository;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class ConvertRawToLogins implements ConvertRawToLoginsInteface{

    private final UsersRepository usersRepository;

    @Override
    public List<Logins> getLogins(List<RawInFile> rawInFiles) {
        List<Logins> logins = new ArrayList<>();

        for (RawInFile r:rawInFiles){
            logins.add(convertFromRowInFile(r));
        }

        return logins;
    }

    @Override
    public Logins convertFromRowInFile(RawInFile rawInFile) {
        Logins logins = new Logins();
        logins.setApplication(rawInFile.getApplication());
        logins.setAccess_date(rawInFile.getAccess_date());

        logins.setUserId(usersRepository.findById(rawInFile.getId_user()).get());
        logins.setId(rawInFile.getId());

        return logins;
    }
}
