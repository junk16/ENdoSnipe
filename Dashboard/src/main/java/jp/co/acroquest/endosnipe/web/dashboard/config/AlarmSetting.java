/*******************************************************************************
 * ENdoSnipe 5.0 - (https://github.com/endosnipe)
 * 
 * The MIT License (MIT)
 * 
 * Copyright (c) 2012 Acroquest Technology Co.,Ltd.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
package jp.co.acroquest.endosnipe.web.dashboard.config;

import java.util.HashSet;
import java.util.Set;

/**
 * アラーム通知設定のオブジェクトです。
 * @author fujii
 *
 */
public class AlarmSetting
{
    /** 通知したかどうか */
    private boolean notify_;

    /** エージェントIDを保存するSet */
    private final Set<Integer> agentSet_ = new HashSet<Integer>();

    /** 通知要求レベル */
    private int alarmLevel_;

    /**
     * デフォルトコンストラクタ。
     */
    public AlarmSetting()
    {

    }

    /**
     * アラーム通知を行うかどうかを返します。
     * @return アラーム通知を行う場合、<code>true</code>
     */
    public boolean isNotify()
    {
        return this.notify_;
    }

    /**
     * アラーム通知を行うかどうかを返します。
     * @param notify アラーム通知を行う場合、<code>true</code>
     */
    public void setNotify(final boolean notify)
    {
        this.notify_ = notify;
    }

    /**
     * アラーム通知対象のエージェントのSetを返します。
     * @return アラーム通知対象のエージェントのSet
     */
    public Set<Integer> getAgentSet()
    {
        return this.agentSet_;
    }

    /**
     * アラーム通知対象のエージェントを設定します。
     * @param agent アラーム通知対象のエージェント
     */
    public void addAgent(final Integer agent)
    {
        this.agentSet_.add(agent);
    }

    /**
     * 指定したエージェントを含むかどうか。
     * @param agentId エージェントID
     * @return 指定したエージェントIDを含む場合、<code>true</code>
     */
    public boolean containAgent(final Integer agentId)
    {
        return this.agentSet_.contains(agentId);
    }

    /**
     * 通知要求レベルを取得します。
     * @return 通知要求レベル(INFO/WARN/ERROR)
     */
    public int getAlarmLevel()
    {
        return alarmLevel_;
    }

    /**
     * 通知要求レベルを設定します。
     * @param alarmLevel 通知要求レベル(INFO/WARN/ERROR)
     */
    public void setAlarmLevel(final int alarmLevel)
    {
        this.alarmLevel_ = alarmLevel;
    }

}
