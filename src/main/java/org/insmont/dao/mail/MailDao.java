/*
 * Copyright (C) 2023 The Insmont Open Source Project
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package org.insmont.dao.mail;

import org.apache.ibatis.annotations.Mapper;
import org.insmont.beans.subscribe.Subscribe_email;
import org.springframework.stereotype.Repository;

/**
 * @author chuhelan
 * @version 1.0
 * @date Wednesday 31 January 2024 4:08 PM
 * @package: org.insmont.dao.mail
 * @Desc:
 */

@Mapper
@Repository
public interface MailDao {
    int insertEmail(String email);

    Subscribe_email selectEmail(String email);

}