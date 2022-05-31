package com.example.rbot.data.model

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import com.example.rbot.BOT
import com.example.rbot.USER

data class ChatModel(val value: String, val type: String, val from: String)

var chat_list: SnapshotStateList<ChatModel> = mutableStateListOf(
    ChatModel("Hello", "text", "bot"),
    ChatModel("Dear", "text", "bot"),
    ChatModel("How Are you?", "text", "bot"),
    ChatModel("I am good", "text", "user"),
    ChatModel("One", "text", BOT),
    ChatModel("Two", "text", USER),
    ChatModel("Three", "text", USER),
    ChatModel("Four", "text", BOT),
)