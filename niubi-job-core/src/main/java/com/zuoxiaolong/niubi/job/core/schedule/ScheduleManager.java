/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zuoxiaolong.niubi.job.core.schedule;

import com.zuoxiaolong.niubi.job.core.config.Context;
import com.zuoxiaolong.niubi.job.core.scanner.MethodTriggerDescriptor;
import org.quartz.JobKey;

import java.util.List;

/**
 * @author Xiaolong Zuo
 * @since 16/1/10 00:59
 */
public interface ScheduleManager {

    void startup();

    void shutdown();

    void startup(String group);

    void shutdown(String group);

    ScheduleStatus getScheduleStatus(String group);

    List<String> getGroupList();

    void bindContext(Context context);

    List<JobKey> getJobKeyList(String group);

    void addJob(MethodTriggerDescriptor descriptor);

}
