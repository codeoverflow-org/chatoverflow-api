package org.codeoverflow.chatoverflow.api.io.input.stat;

import org.codeoverflow.chatoverflow.api.io.dto.stat.UserStats;
import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.tipeeestream.TipeeestreamStats;
import org.codeoverflow.chatoverflow.api.io.input.Input;

/**
 * An input that provides various user statistics for a service
 * @param <T>
 */
public interface StatInput<T extends UserStats> extends Input {

    /**
     * Get the statistics for your account
     *
     * @return your stats
     */
    TipeeestreamStats getStats();
}
