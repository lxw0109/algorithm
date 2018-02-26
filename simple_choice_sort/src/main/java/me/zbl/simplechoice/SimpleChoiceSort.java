/*
 * Copyright 2018 JamesZBL
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package me.zbl.simplechoice;

/**
 * 简单选择排序
 *
 * @author JamesZBL
 * @date 2018-02-26
 */
public class SimpleChoiceSort {

  public static int[] sort(int[] raw) {
    for (int i = 0; i < raw.length; i++) {
      for (int j = i; j < raw.length; j++) {
        if (raw[j] < raw[i]) {
          int tmp = raw[i];
          raw[i] = raw[j];
          raw[j] = tmp;
        }
      }
    }
    return raw;
  }
}