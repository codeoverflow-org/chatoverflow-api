package org.codeoverflow.chatoverflow.api.io.input.stat;

import org.codeoverflow.chatoverflow.api.io.dto.stat.UserStats;
import org.codeoverflow.chatoverflow.api.io.input.Input;

public interface StatInput<T extends UserStats> extends Input {

    T getStatsById(String userId);

    T getStatsByName(String userName);
}
