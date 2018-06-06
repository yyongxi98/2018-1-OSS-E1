/*
 * Copyright (C) 2016-2018 phantombot.tv
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package tv.phantombot.event.irc.channel;

import tv.phantombot.twitchwsirc.chat.Session;

public class IrcChannelUsersUpdateEvent extends IrcChannelEvent {
    private final String[] joins;
    private final String[] parts;

    /*
     * Class constructor.
     *
     * @param {Session}  session
     * @param {String[]} joins
     * @param {String[]} parts
     */
    public IrcChannelUsersUpdateEvent(Session session, String[] joins, String[] parts) {
        super(session);

        this.joins = joins;
        this.parts = parts;
    }

    /*
     * Class constructor.
     *
     * @param {String[]} joins
     * @param {String[]} parts
     */
    public IrcChannelUsersUpdateEvent(String[] joins, String[] parts) {
        super(null);

        this.joins = joins;
        this.parts = parts;
    }

    /*
     * Method that returns the current array of users who joined the channel in the last 10 minutes.
     *
     * @return {String[]} joins
     */
    public String[] getJoins() {
        return this.joins;
    }

    /*
     * Method that returns the current array of users who left the channel in the last 10 minutes.
     *
     * @return {String[]} parts
     */
    public String[] getParts() {
        return this.parts;
    }
}
