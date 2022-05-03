package com.tokorogadokkoi.java.realworldapp.domain.user;

import com.tokorogadokkoi.java.realworldapp.domain.shared.email.EmailAddress;
import com.tokorogadokkoi.java.realworldapp.domain.shared.exception.DomainException;
import lombok.*;

/**
 * ユーザークラス
 */
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode(of = {"id"})
@Getter
public class User {
    private final UserId id;
    private final EmailAddress emailAddress;

    static User create(final EmailAddress emailAddress) throws DomainException {
        val userId = UserId.create();

        return new User(userId, emailAddress);
    }

    static User reConstructor(final UserId id, final EmailAddress emailAddress) {
        return new User(id, emailAddress);
    }
}
